package com.ads.countOnlieNumber;

import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.ads.persistence.User;

@WebListener
public class SessionManager implements HttpSessionListener {

	private int userNumber = 0;
	
	public User getUserBySessionId(List<User> userList,String sessionId){
		for(User user: userList){
			if(sessionId.equals(user.getSessionId())){
				return user;
			}
		}
		return null;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		userNumber++;
		se.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		List<User> userList = (List<User>) se.getSession().getServletContext().getAttribute("userList");
		if(null!=getUserBySessionId(userList, se.getSession().getId())){
			userList.remove(getUserBySessionId(userList, se.getSession().getId()));
		}
		userNumber--;
		se.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

}
