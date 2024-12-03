package com.xworkz.kelasa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.kelasa.repo.KelasaRepo;
import com.xworkz.kelasa.repo.KelasaRepoImp;
import com.xworkz.kelasa.service.KelasaService;
import com.xworkz.kelasa.service.KelasaServiceImp;
@WebServlet(urlPatterns = "/delete")
public class ServletDelete extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		KelasaRepo kr=new KelasaRepoImp();
		KelasaService ks=new KelasaServiceImp(kr);
		
		int id= Integer.parseInt(req.getParameter("id"));
		String delete=ks.delete(id);
		System.out.println(delete);
		req.setAttribute("delete", delete);
		
		
		RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
