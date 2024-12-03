package com.xworkz.kelasa.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.kelasa.dto.KelasaDto;
import com.xworkz.kelasa.repo.KelasaRepo;
import com.xworkz.kelasa.repo.KelasaRepoImp;
import com.xworkz.kelasa.service.KelasaService;
import com.xworkz.kelasa.service.KelasaServiceImp;

@WebServlet(urlPatterns = "/submit-job-seeker-data")
public class ServletSave extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KelasaDto dto = new KelasaDto();
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

		KelasaRepo kr = new KelasaRepoImp();
		KelasaService ks = new KelasaServiceImp(kr);
		String res = ks.save(dto);
		req.setAttribute("result", res);

		RequestDispatcher requestDisp = req.getRequestDispatcher("sucess.jsp");
		requestDisp.forward(req, resp);

	}

}
