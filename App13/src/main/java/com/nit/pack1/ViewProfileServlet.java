package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();

		String user_name = null;
		if (arr == null) {
			req.setAttribute("msg", "Session Expired!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		} else {
			for (Cookie c : arr) {
				if ("ck1".equals(c.getName())) {
					user_name = c.getValue();
				}
			}
			req.setAttribute("msg", user_name);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}

	}
}
