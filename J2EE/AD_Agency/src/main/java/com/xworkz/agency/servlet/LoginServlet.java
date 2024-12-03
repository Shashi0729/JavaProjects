package com.xworkz.agency.servlet;
	
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.xworkz.agency.entity.AgencyEntity;
import com.xworkz.agency.util.AgencyUtil;

import javax.servlet.RequestDispatcher;
	import java.io.IOException;

	@WebServlet("/login")
	public class LoginServlet extends HttpServlet {

	  //  private EntityManagerFactory emf;

	 

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
	        String email = request.getParameter("email");
	        int password = Integer.parseInt( request.getParameter("password"));
	        
	        AgencyEntity entity =new AgencyEntity();
	        // Find the user by email
	        EntityManager em = AgencyUtil.getmanager();
	        try {
	         

	            // Check password (Assuming passwords are stored in plain text for simplicity)
	            if (entity.getEmail().equals(email) && entity.getPassword()==password) {
	                request.setAttribute("message", "Login successful");
	                RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
	                dispatcher.forward(request, response);
	            } else {
	                request.setAttribute("message", "Invalid email or password");
	                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	                dispatcher.forward(request, response);
	            }
	        } catch (Exception e) {
	            request.setAttribute("message", "Invalid");
	            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	            try {
					dispatcher.forward(request, response);
				} catch (ServletException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        } finally {
	            em.close();
	        }
	    }

	  
	    }
	



