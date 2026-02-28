package com.nit.pack1;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("select * from productTest");
			ResultSet rs = pstmt.executeQuery();
			out.println("<center>");
			out.println("Product Details<br>");
			while (rs.next()) {
				out.println(rs.getString(1));
				out.println(rs.getString(2));
				out.println(rs.getString(3));
				out.println(rs.getString(4)+"<br>");
				out.println("<center>");
			}
			out.println("</center>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
