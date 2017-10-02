package com.ads.kindsOfListeners;

import java.util.Enumeration;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// http://127.0.0.1:8080/webListener?name=houbberVan&value=FY470
		String name = sre.getServletRequest().getParameter("name");
		Enumeration<String> names = sre.getServletRequest().getParameterNames();
		System.out.println("requestInitialized name = " + name);
		System.out.println("requestInitialized names = " + names);
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// http://127.0.0.1:8080/webListener?name=houbberVan
		System.out.println("requestDestroyed");
	}

}
