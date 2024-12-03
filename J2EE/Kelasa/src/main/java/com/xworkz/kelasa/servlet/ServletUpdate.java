package com.xworkz.kelasa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.kelasa.dto.KelasaDto;
import com.xworkz.kelasa.repo.KelasaRepoImp;
import com.xworkz.kelasa.service.KelasaService;
import com.xworkz.kelasa.service.KelasaServiceImp;

@WebServlet(urlPatterns = "/update")
public class ServletUpdate extends HttpServlet {

	public ServletUpdate() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Search operation");
		KelasaRepoImp rep = new KelasaRepoImp();
		KelasaService service = new KelasaServiceImp(rep);
		int id = Integer.parseInt(request.getParameter("id"));
		KelasaDto dto = service.searchById(id);
		request.setAttribute("search", dto);
		RequestDispatcher req = request.getRequestDispatcher("update.jsp");
		try {
			req.forward(request, response);
		} catch (ServletException | IOException e) {

			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Update operation");
		KelasaDto dto = new KelasaDto();
//			int id =Integer.parseInt(req.getParameter("id"));
//			dto.setId(id);
		String name = req.getParameter("fullName");
		dto.setFullname(name);
		String email = req.getParameter("email");
		dto.setEmail(email);
		long phone = Long.parseLong(req.getParameter("phone"));
		dto.setPhone(phone);
		String location = req.getParameter("location");
		dto.setLocation(location);
		String jobtitle = req.getParameter("jobTitle");
		dto.setJobtitle(jobtitle);
		String jobtype = req.getParameter("jobType");
		dto.setJobtype(jobtype);
		int salary = Integer.parseInt(req.getParameter("salaryExpectation"));
		dto.setSalaryexpectation(salary);
		String skills = req.getParameter("skills");
		dto.setSkills(skills);

		KelasaRepoImp rep = new KelasaRepoImp();
		KelasaService service = new KelasaServiceImp(rep);
		System.out.println("hi1");
		int ids = Integer.parseInt(req.getParameter("id"));
		System.out.println("hi2");
		String updateResult = service.updatebyId(ids, dto);

		req.setAttribute("updateResult", updateResult);

		RequestDispatcher dispatch = req.getRequestDispatcher("view.jsp");

		try {
			dispatch.forward(req, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
