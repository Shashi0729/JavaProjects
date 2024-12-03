package com.xworkz.agency.servlet;



	
	

	import java.io.IOException;
	import java.util.List;

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

	

	@WebServlet("/view")
	public class ReadServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;


	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        AgencyRepo repo = new AgencyRepoImpl();
	        AgencyService service = new AgencyServiceImpl(repo);

	        List<AgencyDto> listOfDto = service.read(); 
	        request.setAttribute("listOfDto", listOfDto);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
	        dispatcher.forward(request, response);
	    }
	}

