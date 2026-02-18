package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class UserRegistrationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserBean ub = new UserBean();
		ub.setU_name(req.getParameter("uname"));
		ub.setU_pwd(req.getParameter("upwd"));
		ub.setU_fname(req.getParameter("ufname"));
		ub.setU_lname(req.getParameter("ulname"));
		ub.setU_mail(req.getParameter("umail"));
		ub.setU_phn(req.getParameter("uphn"));
		
		UserRegisterDAO regDAO_obj = new UserRegisterDAO();
		int rowCount = regDAO_obj.insertUserData(ub);
		if(rowCount>0) {
			req.setAttribute("msg", "User Registration Sucessfully..");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}else {
			req.setAttribute("msg", "User Registration Faild..");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		
	}
}
