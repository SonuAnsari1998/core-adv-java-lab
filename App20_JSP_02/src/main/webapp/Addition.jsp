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
				int num1 = Integer.parseInt(request.getParameter("num1"));
				int num2 = Integer.parseInt(request.getParameter("num2"));
				out.println("Addition: "+(num1+num2)+"<br><br>");
				out.println("Date : "+request.getParameter("data")+"</h1>");
			%>
			<%@ include file="index.html" %>
		
	</center>
</body>
</html>