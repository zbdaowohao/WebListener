package com.ads.persistence;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * session的持久化：钝化（将session以文件的形式保存在服务器\work\Catalina\localhost\工程名 的SESSIONS.ser文件，以便服务重启后可以获取session，重启获取session后将文件删除），
 * 需要再实现序列化接口
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
	
	/**绑定*/
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("valueBound name:"+event.getName());
		System.out.println("valueBound value:"+event.getValue());
	}

	/**解绑*/
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("valueUnBound name:"+event.getName());
		System.out.println("valueUnBound value:"+event.getValue());
	}
	
	/**钝化*/
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("sessionWillPassivate "+se.getSource());		
	}

	/**活化*/
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
