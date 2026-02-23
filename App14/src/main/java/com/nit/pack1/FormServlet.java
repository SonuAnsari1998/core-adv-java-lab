package com.nit.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dis")
public class FormServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("tname");
		String age = req.getParameter("tage");
		String gender = req.getParameter("gen");
		String maritalStatus = req.getParameter("ms");
		String qualification = req.getParameter("qlfy");
		String courses = req.getParameter("crs");
		String hobbies = req.getParameter("hb");
		
//		req.setAttribute("name", name);
//        req.setAttribute("age", age);
//        req.setAttribute("gender", gender);
//        req.setAttribute("maritalStatus", maritalStatus);
//        req.setAttribute("qualification", qualification);
//        req.setAttribute("courses", courses);
//        req.setAttribute("hobbies", hobbies);
		
        
        req.getRequestDispatcher("view.jsp").forward(req, res);
        
        
	}
	
	public class RegInfo{
		String name;
		
	}
}
