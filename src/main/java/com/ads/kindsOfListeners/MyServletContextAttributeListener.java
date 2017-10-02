package com.ads.kindsOfListeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttributeListener implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("ContextAttributeAdded:"+event.getName());		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("ContextAttributeAdded:"+event.getName());		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("ContextAttributeAdded:"+event.getName());		
	}

}
