package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			throw new RuntimeException("Session Expired...");
		} else {
			int rowCount = new DeleteProductDAO().deleteProduct(req.getParameter("pcode"));
			if (rowCount > 0) {
				req.setAttribute("msg", "Product Deleted!!!");
				req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
			} else {
				req.setAttribute("msg", "Product delete Fails...");
				req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
			}
		}
	}
}
