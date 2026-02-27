package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/creg")
public class CustomerRegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CustomerBean cb = new CustomerBean();
		cb.setUserName(req.getParameter("uname"));
		cb.setPassword(req.getParameter("pass"));
		cb.setFirstName(req.getParameter("fname"));
		cb.setLastName(req.getParameter("lname"));
		cb.setAddress(req.getParameter("add"));
		cb.setMailId(req.getParameter("mid"));
		cb.setPhone(req.getParameter("mobile"));
		
		int rowCount = CustomerRegisterDAO.custRegister(cb);
		
		if(rowCount>0) {
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}else {
			System.out.println("Data Not Inserted..");
		}
	}

}
