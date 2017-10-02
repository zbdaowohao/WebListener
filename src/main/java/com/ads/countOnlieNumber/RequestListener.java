package com.ads.countOnlieNumber;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import com.ads.persistence.User;

@WebListener
public class RequestListener implements ServletRequestListener {

	private List<User> userList;
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		userList = (List<User>) sre.getServletContext().getAttribute("userList");
		if(null==userList){
			userList = new ArrayList<User>();
		}
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		String sessionId = request.getSession().getId();
		SessionManager sessionManager = new SessionManager();
		if(null==sessionManager.getUserBySessionId(userList,sessionId)){
			User user = new User();
			user.setSessionId(sessionId);
			user.setValue(request.getRemoteAddr());
			userList.add(user);
		}
		sre.getServletContext().setAttribute("userList", userList);
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
	}
	
}
