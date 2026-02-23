package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		AdminBean abean = new AdminLoginDAO().checkAdminLogin(req.getParameter("a_name"), req.getParameter("a_pwd"));

		if (abean == null) {
			req.setAttribute("msg", "Invalid Admin Login credentials");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("abean", abean);
			req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
		}

	}
}
