package com.xworkz.project.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.project.dto.ProjectDto;

@WebServlet(urlPatterns = "/save")
public class ServletSave extends HttpServlet {

	ProjectDto dto = new ProjectDto();

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String name = req.getParameter("name");
		System.out.println(name);
		dto.setName(req.getParameter("name"));
		dto.setRole(req.getParameter("role"));
		dto.setDate(req.getParameter("date"));
		System.out.println(dto);
		
	
	}
	
}
