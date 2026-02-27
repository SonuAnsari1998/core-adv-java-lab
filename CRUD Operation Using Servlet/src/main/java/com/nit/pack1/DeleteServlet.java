package com.nit.pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("delete from product2 where pid=?");
			pstmt.setString(1, id);
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				req.setAttribute("msg", "Deleted Sucessfully!!");
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
