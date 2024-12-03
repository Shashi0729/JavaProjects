package com.xworkz.agency.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.agency.dto.AgencyDto;
import com.xworkz.agency.repo.AgencyRepo;
import com.xworkz.agency.repo.AgencyRepoImpl;
import com.xworkz.agency.service.AgencyService;
import com.xworkz.agency.service.AgencyServiceImpl;

@WebServlet(urlPatterns = "/submit")
public class SaveServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		AgencyDto dto = new AgencyDto();
		dto.setName(req.getParameter("name"));
		dto.setPassword(Integer.parseInt(req.getParameter("password")));
		dto.setEmail(req.getParameter("email"));
		dto.setCompany_name(req.getParameter("company_name"));
		dto.setPhone(Long.parseLong(req.getParameter("phone")));
		dto.setProduct_name(req.getParameter("product_name"));
		dto.setDescription(req.getParameter("description"));

		AgencyRepo repo = new AgencyRepoImpl();
		AgencyService ser = new AgencyServiceImpl(repo);
		String res = ser.save(dto);

		req.setAttribute("result", res);

		RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}

	}

}
