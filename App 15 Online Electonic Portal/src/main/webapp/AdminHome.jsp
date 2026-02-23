<%@page import="com.nit.pack1.AdminBean"%>
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
				AdminBean abean = (AdminBean)session.getAttribute("abean");
				out.println("Welcome "+abean.getA_fname()+"<br><br>");
			
			%>
			<a href="AddProduct.html">Add Product</a> <br><br>
			<a href="View1">View Product</a><br><br>
			<a href="Logout">Logout</a><br><br>
		</h1>
	</center>
</body>
</html>