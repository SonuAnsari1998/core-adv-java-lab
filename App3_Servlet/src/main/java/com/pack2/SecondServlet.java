package com.pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs2")
public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String empid = req.getParameter("empid");
		String empsal = req.getParameter("empsal");
		String empexp = req.getParameter("empexp");

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");



		pw.println("<center> <h1>");
		pw.println("Employee Data<br>");
		pw.println("EmpName: " + name + "<br><br>");
		pw.println("EmpId: " + empid + "<br><br>");
		pw.println("EmpSal: " + empsal + "<br><br>");
		pw.println("EmpExp: " + empexp + "<br><br>");
		pw.println("</h1></center>");

	}

}
