package com.ads.kindsOfListeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MyHttpSessionAttributeListener implements
		HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("SessionAttributeAdded:"+event.getName());		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("SessionAttributeAdded:"+event.getName());		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("SessionAttributeAdded:"+event.getName());		
	}

}
