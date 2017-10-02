package com.ads.kindsOfListeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// ͨ��ע�����ü�����
@WebListener("����һ����������ע��")
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// ��ȡ��ʼ���Ĳ���
		String initParam = sce.getServletContext().getInitParameter("initParam");
		// ��ʼ��ʱ����ȫ�ֱ�������
		sce.getServletContext().setAttribute("user", "houbberVan");
		System.out.println("contextInitialized :initParam = " + initParam);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// �����ݿ����ӹر�ʱ�ɽ�����Դ�ͷŲ���
		System.out.println("contextDestroyed");
	}

}
