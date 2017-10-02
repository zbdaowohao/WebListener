package com.ads.kindsOfListeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 通过注解设置监听器
@WebListener("这是一个监听器的注解")
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 获取初始化的参数
		String initParam = sce.getServletContext().getInitParameter("initParam");
		// 初始化时放入全局变量参数
		sce.getServletContext().setAttribute("user", "houbberVan");
		System.out.println("contextInitialized :initParam = " + initParam);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 当数据库连接关闭时可进行资源释放操作
		System.out.println("contextDestroyed");
	}

}
