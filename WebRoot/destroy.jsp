<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.getSession().removeAttribute("currentUserName");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>destroy.jsp</title>
</head>

<body>
	<%request.getSession().getAttribute("currentUserName"); %>
	This is my Destroy page.
	<br>
	<button onclick="location.href='./index.jsp'">index</button>
	<br>
	当前在线用户人数  : ${userNumber}
	<%-- <br>
	<%
	List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
	if(null!=userList){
		for(User user:userList){
	%>
	IP:<%=user.getValue() %>, SessionId:<%=user.getSessionId() %>
	<%
		}
	}
	%> --%>
</body>
</html>
