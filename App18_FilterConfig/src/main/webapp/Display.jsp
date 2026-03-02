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
			String uname = (String)request.getParameter("u_name");
			String filterName = (String) request.getAttribute("filterName");
			out.println("Welcome: "+uname+"<br><br>");
			out.println("Filter Name: " + filterName);
			%>
		</h1>
	</center>
</body>
</html>