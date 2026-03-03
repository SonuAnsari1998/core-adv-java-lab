package com.nit.pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListeners implements ServletContextListener, ServletContextAttributeListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext Object Initilazed");
		ServletContext context = sce.getServletContext();
		System.out.println("Online Electronic Store is deployed in to :" + context.getServerInfo());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Servlet Object Destroyed");
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Attribute added to the ServletContext Object ");
		String attributeName = scae.getName();
		System.out.println("Attribute Name: " + attributeName);
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Attribuute Remove from the ServletContext");
	}

}
