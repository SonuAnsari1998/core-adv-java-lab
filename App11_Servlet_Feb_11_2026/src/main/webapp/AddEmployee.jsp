<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
	<%
	String data=(String)request.getAttribute("msg");
	out.println(data+"<br><br>");
	%>
	
	<a href="emp.html">Add Employee Data</a> <br> <br>
	<a href="view">View Employee Data</a>
	</h1>
</body>
</html>