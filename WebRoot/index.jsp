<%@page import="com.ads.persistence.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";

	request.getSession().setAttribute("currentUserName", new com.ads.persistence.User());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>index.jsp</title>
</head>

<body>
	<%request.getSession().getAttribute("currentUserName"); %>
	This is my index JSP page.
	<br>
	<button onclick="location.href='./destroy.jsp'">Destroy</button>
	<br>
	当前在线用户人数  : ${userNumber}
	<br>
	<%
	List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
	if(null!=userList){
		for(User user:userList){
	%>
	<br>
	IP:<%=user.getValue() %>, SessionId:<%=user.getSessionId() %>
	<%
		}
	}
	%>
</body>
</html>
