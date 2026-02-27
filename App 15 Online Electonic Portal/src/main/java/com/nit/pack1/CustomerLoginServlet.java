package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

		CustomerBean cb = CustomerLoginDAO.loginCustomer(uname, pass);
		if (cb != null) {
			req.setAttribute("cbean", cb);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);

		} else {
			System.out.println("CB is null");
		}
	}

}
