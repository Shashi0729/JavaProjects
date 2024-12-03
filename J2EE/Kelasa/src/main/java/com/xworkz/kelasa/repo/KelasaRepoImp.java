package com.xworkz.kelasa.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.kelasa.dto.KelasaDto;
import com.xworkz.kelasa.util.KelasaUtil;

public class KelasaRepoImp implements KelasaRepo {

//	@Override
//	public boolean read(KelasaDto dto) {
//		
//		return false;
//	}

	@Override
	public boolean save(KelasaDto dto) {
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(KelasaUtil.JDBCURL, KelasaUtil.USERNAME,
					KelasaUtil.PASSWORD);
			
			String query = "insert into employees (name,email,phone,joblocation,jobtitle,jobtype,salaryexpectation,skills) values(?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, dto.getFullname());
			statement.setString(2, dto.getEmail());
			statement.setLong(3, dto.getPhone());
			statement.setString(4, dto.getLocation());
			statement.setString(5, dto.getJobtitle());
			statement.setString(6, dto.getJobtype());
			statement.setInt(7, dto.getSalaryexpectation());
			statement.setString(8, dto.getSkills());
			boolean result = statement.execute();
			if (!result) {
				System.out.println("Saved");
			} else {
				System.out.println("Not Stored");
			}
		} catch (SQLException |ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		return false;
	}

	@Override
	public List<KelasaDto> read() {
	
			List<KelasaDto> list = new ArrayList<>();
			try {
				Connection connection = DriverManager.getConnection(KelasaUtil.JDBCURL, KelasaUtil.USERNAME,
						KelasaUtil.PASSWORD);
				String readQuery = "select * from employees";
				Statement select = connection.createStatement();
				ResultSet result = select.executeQuery(readQuery);
				while (result.next()) {

					KelasaDto dto = new KelasaDto();
					dto.setId(result.getInt(1));
					dto.setFullname(result.getString(2));
					dto.setEmail(result.getString(3));
					dto.setPhone(result.getLong(4));
					dto.setLocation(result.getString(5));
					dto.setJobtitle(result.getString(6));
					dto.setJobtype(result.getString(7));
					dto.setSalaryexpectation(result.getInt(8));
					dto.setSkills(result.getString(9));

					list.add(dto);
				}

			} catch (SQLException e) {
				return Collections.emptyList();
			}
			return list;
		
	}

	@Override
	public boolean delete(int id) {
		try {
			Connection connection = DriverManager.getConnection(KelasaUtil.JDBCURL, KelasaUtil.USERNAME,
					KelasaUtil.PASSWORD);
			String deleteQuery = "Delete from employees where id=?";
			PreparedStatement statement =connection.prepareStatement(deleteQuery);
			statement.setInt(1, id);
			
			if(!statement.execute()) {
				return true;
			}
		}catch (Exception e) {
			
		}
		return false;
	}


	@Override
	public KelasaDto searchById(int id) {
		 try {
		        Connection connection = DriverManager.getConnection(KelasaUtil.JDBCURL, KelasaUtil.USERNAME, KelasaUtil.PASSWORD);
		        String searchquery = "SELECT * FROM employees WHERE id = ?";
		        PreparedStatement statement = connection.prepareStatement(searchquery);
		        statement.setInt(1, id);
		        ResultSet resultSet = statement.executeQuery();

		        if (resultSet.next()) {
		        	KelasaDto dto=new KelasaDto();
		        	dto.setId(resultSet.getInt(1));
					dto.setFullname(resultSet.getString(2));
					dto.setEmail(resultSet.getString(3));
					dto.setPhone(resultSet.getLong(4));
					dto.setLocation(resultSet.getString(5));
					dto.setJobtitle(resultSet.getString(6));
					dto.setJobtype(resultSet.getString(7));
					dto.setSalaryexpectation(resultSet.getInt(8));
					dto.setSkills(resultSet.getString(9));
		            return dto;
		        }
		    } catch (SQLException e) {
		        System.out.println(e.getMessage());
		    }

			return new KelasaDto() ;

	}

	@Override
	public String updatebyName(int id, KelasaDto dto) {
		try {
			 Connection connection = DriverManager.getConnection(KelasaUtil.JDBCURL, KelasaUtil.USERNAME, KelasaUtil.PASSWORD);
		        String updatequery =  "update employees set name=?,email=?,phone=?,joblocation=?,jobtitle=?,jobtype=?,salaryexpectation=?,skills=? where id = ?";
		        PreparedStatement statement = connection.prepareStatement(updatequery);
		        statement.setString(1, dto.getFullname());
				statement.setString(2, dto.getEmail());
				statement.setLong(3, dto.getPhone());
				statement.setString(4, dto.getLocation());
				statement.setString(5, dto.getJobtitle());
				statement.setString(6, dto.getJobtype());
				statement.setInt(7, dto.getSalaryexpectation());
				statement.setString(8, dto.getSkills());
				
				statement.setInt(9, id);

		        int updatedRows = statement.executeUpdate();
				
				return updatedRows+"Updated Done";

		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return "not updated";
}
}
