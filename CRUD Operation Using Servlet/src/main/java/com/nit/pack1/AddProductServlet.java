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
		AddProductServlet sb = new AddProductServlet();
		String id = req.getParameter("p_id");
		String name = req.getParameter("p_name");
		String price = req.getParameter("p_price");

		int rowCount = sb.addProduct(id, name, price);

		if (rowCount > 0) {
			req.setAttribute("msg", "Product Added Sucessfully!!! <br>");
			req.getRequestDispatcher("output.jsp").forward(req, resp);
		} else {
			req.setAttribute("msg", "Faild!!");
			req.getRequestDispatcher("output.jsp").forward(req, resp);

		}

	}

	public int addProduct(String id, String name, String price) {
		int rowCount = 0;

		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("insert into product2 values (?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, price);

			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
