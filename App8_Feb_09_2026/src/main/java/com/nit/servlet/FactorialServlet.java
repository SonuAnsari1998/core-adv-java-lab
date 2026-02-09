package com.nit.servlet;

import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.interfaces.RSAKey;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FactorialServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int x = Integer.parseInt(req.getParameter("num"));
		
		int fac=1;
		for(int i=1; i<=x; i++) {
			fac=fac*i;
		}
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<centre><h1>");
		pw.println("The factorial for : "+x+" is "+fac+"<br><br>");
		pw.println("</h1></centre>");
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		
		rd.include(req, res);
	}

}
