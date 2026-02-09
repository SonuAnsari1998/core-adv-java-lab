package com.nit.pack3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fd")
public class Servlet3 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uid= req.getParameter("uid");
		String fname= req.getParameter("ufname");
		String lname= req.getParameter("ulname");
		String mail= req.getParameter("umail");
		String phone= req.getParameter("uphone");
		
		PrintWriter wp = res.getWriter();
		res.setContentType("text/html");
		
		wp.print("User Id: "+uid+"<br>");
		wp.print("User First Name: "+fname+"<br>");
		wp.print("User Last Name: "+lname+"<br>");
		wp.print("User Mail Id: "+mail+"<br>");
		wp.print("User Phone no.: "+phone);
	}

}
