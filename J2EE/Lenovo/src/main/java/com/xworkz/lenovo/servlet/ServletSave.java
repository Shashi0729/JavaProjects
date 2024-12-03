package com.xworkz.lenovo.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.lenovo.dto.LenovoDto;
import com.xworkz.lenovo.excel.WriteDataToExcel;
import com.xworkz.lenovo.repo.LenovoRepo;
import com.xworkz.lenovo.repo.LenovoRepoImpl;
import com.xworkz.lenovo.service.LenovoService;
import com.xworkz.lenovo.service.LenovoServiceImpl;



@WebServlet(urlPatterns = "/submit")
public class ServletSave extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LenovoDto dto = new LenovoDto();
		dto.setName(req.getParameter("name"));
		dto.setEmail(req.getParameter("email"));

		LenovoRepo lr = new LenovoRepoImpl();
		LenovoService ls = new LenovoServiceImpl(lr);
		String res = ls.save(dto);
		WriteDataToExcel excel=new  WriteDataToExcel();

		req.setAttribute("result", res);

		RequestDispatcher requestDisp = req.getRequestDispatcher("Sucess.jsp");
		requestDisp.forward(req, resp);

	}

}

