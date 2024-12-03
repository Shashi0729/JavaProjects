package com.xworkz.lenovo.runner;

	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.TypedQuery;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.lenovo.entity.LenovoEntity;
import com.xworkz.lenovo.util.LenovoUtil;


	public class ExcelRunner {

	    public static void main(String[] args) {
	        // Initialize JPA EntityManager
	        
	        EntityManager entityManager = LenovoUtil.getfactory();

	        // File path to save the Excel file
	        String filePath = "D:\\excel\\excel.xlsx";

	        // Create a new workbook and sheet for Excel file
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Database Export");

	        try {
	            // Fetch data from the database using JPA TypedQuery
	            String jpql = "SELECT e FROM LenovoEntity e";
	            TypedQuery<LenovoEntity> query = entityManager.createQuery(jpql, LenovoEntity.class);
	            List<LenovoEntity> userDetailsList = query.getResultList();

	            System.out.println("Data fetched successfully from the database!");

	            // Create header row in the Excel sheet
	            Row headerRow = sheet.createRow(0);
	            headerRow.createCell(0).setCellValue("User ID");
	            headerRow.createCell(1).setCellValue("Name");
	            headerRow.createCell(2).setCellValue("Email");
	         

	            // Populate the Excel sheet with data from the database
	            int rowIndex = 1; // Start from the second row
	            for (LenovoEntity user : userDetailsList) {
	                Row dataRow = sheet.createRow(rowIndex++);
	                dataRow.createCell(0).setCellValue(user.getId());
	                dataRow.createCell(1).setCellValue(user.getName());
	                dataRow.createCell(2).setCellValue(user.getEmail());
	              
	            }

	            // Write the workbook to the specified file path
	            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
	                workbook.write(fileOut);
	                System.out.println("Database exported successfully to: " + filePath);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the workbook and EntityManager
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            entityManager.close();
	        }
	    }
	}



