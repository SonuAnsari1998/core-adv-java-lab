package com.nit.pack1;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aes")
public class AddEmpDervlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws  IOException, ServletException {
		EmpBean eb = new EmpBean();
		eb.setEmp_id(req.getParameter("eid"));
		eb.setEmp_fname(req.getParameter("efname"));
		eb.setEmp_lname(req.getParameter("elname"));
		eb.setEmp_sal(Integer.parseInt(req.getParameter("esal")));
		eb.setEmp_address(req.getParameter("eaddr"));

		AddEmpDAO addDAO_obj = new AddEmpDAO();
		int rowCount = addDAO_obj.insertEmpData(eb);
		if (rowCount > 0) {
			req.setAttribute("msg", "Employee Record Inserted Sucessfully...");
			req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
		} else {
			throw new RuntimeException("Employee Record Not inserted !!!");
		}
	}
}
