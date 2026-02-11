package com.nit.pack1;

import java.io.IOException;
import java.lang.reflect.GenericSignatureFormatError;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ms")
public class MainServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("Display.jsp").forward(req, res);
		
		
	}

}
