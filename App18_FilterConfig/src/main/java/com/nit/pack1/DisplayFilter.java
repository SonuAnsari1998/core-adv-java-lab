package com.nit.pack1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
@WebFilter("/dis")
public class DisplayFilter implements Filter {

	public FilterConfig fcg = null;

	@Override
	public void init(FilterConfig fc) {
		this.fcg=fc;

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws ServletException, IOException {
		
		req.setAttribute("filterName", fcg.getFilterName());
		req.getRequestDispatcher("Display.jsp").forward(req, res);
	}

}
