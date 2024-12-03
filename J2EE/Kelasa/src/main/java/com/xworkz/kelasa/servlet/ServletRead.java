package com.xworkz.kelasa.servlet;

import java.io.IOException;

import java.util.List;

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

@WebServlet(urlPatterns = "/view")
public class ServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		KelasaRepo kr=new KelasaRepoImp();
		KelasaService ks=new KelasaServiceImp(kr);
		List<KelasaDto> list= ks.read();
		

		request.setAttribute("listOfValue", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

}
