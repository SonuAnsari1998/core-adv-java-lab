package com.nit.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewEmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ViewEmpDAO viewObj = new ViewEmpDAO();
		ArrayList<EmpBean> al = viewObj.reterive_empData();
		req.setAttribute("list", al);
		req.getRequestDispatcher("viewEmployee.jsp").forward(req, res);
	}
}
