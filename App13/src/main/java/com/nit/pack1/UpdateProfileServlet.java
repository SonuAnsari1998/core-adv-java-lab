package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();
		String user_name = null;
		if (arr == null) {
			req.setAttribute("msg", "Session Expired!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		} else {
			ServletContext context = req.getServletContext();
			UserBean ub = (UserBean) context.getAttribute("msg");
			ub.setU_fname(req.getParameter("u_fname"));
			ub.setU_fname(req.getParameter("u_lname"));
			ub.setU_fname(req.getParameter("u_mail"));
			ub.setU_fname(req.getParameter("u_phn"));
			int rowCount = new UpdateProfileDAO().updateProfile(ub);
			if (rowCount > 0) {
				req.setAttribute("msg", "Profile Updated");
				for (Cookie c : arr) {
					if ("ck1".equals(c.getName())) {
						user_name = c.getValue();
					}
				}
				req.setAttribute("user_name", user_name);
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			} else {
				throw new RuntimeException("Profile NOT Updated!!!");
			}
		}
	}
}
