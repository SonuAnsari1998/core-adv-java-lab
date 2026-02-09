package com.nit.pak7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs1")
public class Servlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		if(userName.equals("sonu") && password.equals("java")) {
			pw.print("Welcome: "+userName+"<br>");
			pw.print("You did the task..."+"<br>");
		}else {
			pw.print("Invalid Credencial...");
		}
		

	}

}
