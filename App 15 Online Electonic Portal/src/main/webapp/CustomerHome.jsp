<%@page import="com.nit.pack1.CustomerBean"%>
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
			CustomerBean cb = (CustomerBean) request.getAttribute("cbean");
			if(cb!=null){
				out.println("Hello Mr. "+cb.getFirstName()+"<br><br>");
			}
		%>
		<a href="ViewCP">View Product</a>
		<a href="Logout.jsp">Logout</a>
		</h1>
	</center>
</body>
</html>