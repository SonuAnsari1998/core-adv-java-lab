package com.nit.pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
//@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener, ServletRequestAttributeListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequestObject Initialized");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("ServletRequestObject Destroyed");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("Attributed added to the Servlet Request ===> " + srae.getName());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute removed from the ServletRequest ==> " + srae.getName());
	}
}
