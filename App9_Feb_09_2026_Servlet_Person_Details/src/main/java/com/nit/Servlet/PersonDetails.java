package com.nit.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/pd")
public class PersonDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String age = req.getParameter("age");
		String mobile = req.getParameter("mobile");
		String gender = req.getParameter("gender");
		String hobbies[] = req.getParameterValues("hb");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("Name: "+name+"<br>");
		pw.println("Age: "+age+"<br>");
		pw.println("Mobile: "+mobile+"<br>");
		pw.println("Gender: "+gender+"<br>");
		
		for(String s:hobbies) {
			pw.println("Hobbies: "+s+"<br>");
		}
	}
}
