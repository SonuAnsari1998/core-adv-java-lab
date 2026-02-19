<%@page import="com.nit.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
		<%
		UserBean ub = (UserBean)application.getAttribute("msg");
		String data = (String)request.getAttribute("msg");
		out.println("This session belogns to "+ub.getU_name()+"<br><br>");
		out.println(data+"<br><br>");
		%>
		<a href="view">View Profile</a>
		<a href="logout">Logout</a>
		</h1>
		</center>
</body>
</html>