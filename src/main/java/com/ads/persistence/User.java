package com.ads.persistence;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * session�ĳ־û����ۻ�����session���ļ�����ʽ�����ڷ�����\work\Catalina\localhost\������ ��SESSIONS.ser�ļ����Ա������������Ի�ȡsession��������ȡsession���ļ�ɾ������
 * ��Ҫ��ʵ�����л��ӿ�
 * 
 * @author Administrator
 * 
 */
public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1198972755656561696L;
	private String name;
	private String value;
	private String sessionId;
	
	/**��*/
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("valueBound name:"+event.getName());
		System.out.println("valueBound value:"+event.getValue());
	}

	/**���*/
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("valueUnBound name:"+event.getName());
		System.out.println("valueUnBound value:"+event.getValue());
	}
	
	/**�ۻ�*/
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("sessionWillPassivate "+se.getSource());		
	}

	/**�*/
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("sessionDidActivate "+se.getSource());		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", value=" + value + ", sessionId="
				+ sessionId + "]";
	}

}
