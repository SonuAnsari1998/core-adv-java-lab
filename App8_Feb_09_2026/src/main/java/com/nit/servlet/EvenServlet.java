package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/es")
public class EvenServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int x = Integer.parseInt(req.getParameter("num"));

		PrintWriter pw = res.getWriter();

		res.setContentType("text/html");
		if (x % 2 == 0) {
			pw.println("<centre><h1>");
			pw.println("Number : " + x + " is Even<br><br>");
			pw.println("</h1></centre>");
		} else {
			pw.println("<centre><h1>");
			pw.println("Number : " + x + " is Odd<br><br>");
			pw.println("</h1></centre>");
		}

		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
	}
}
