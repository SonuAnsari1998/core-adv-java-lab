package com.nit.pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("p_id");
		String name = req.getParameter("p_name");
		String price = req.getParameter("p_price");
		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("update product2 set PNAME=?, PPRICE=? where PID=?");
			pstmt.setString(1, name);
			pstmt.setString(2, price);
			pstmt.setString(3, id);

			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				req.setAttribute("msg", "Updated Sucessfully!!!");
				req.getRequestDispatcher("output.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Faild!!");
				req.getRequestDispatcher("output.jsp").forward(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
