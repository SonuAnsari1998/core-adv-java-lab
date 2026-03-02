package com.nit.pack1;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/log")
public class LoginFilter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain cf) throws IOException, ServletException {
		UserBean ub = new UserLoginDAO().checkLogin(req.getParameter("uname"), req.getParameter("upwd"));
		
		if(ub==null) {
			throw new RuntimeException("Invlid Login");
		}else {
			req.setAttribute("ub", ub);
			cf.doFilter(req, res);
		}

	}

}
