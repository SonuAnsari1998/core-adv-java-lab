package com.nit.pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("p_id");
		String name = req.getParameter("p_name");
		String price = req.getParameter("p_price");
		String qty = req.getParameter("p_qty");

		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("insert into productTest values (?, ?, ?, ?)");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, price);
			pstmt.setString(4, qty);
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				req.setAttribute("msg", "Product Added Sucessfully!!!");
				req.getRequestDispatcher("Result.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Faild!!");
				req.getRequestDispatcher("Result.jsp").forward(req, resp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
