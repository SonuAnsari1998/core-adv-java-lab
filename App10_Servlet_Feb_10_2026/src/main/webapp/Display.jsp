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
			String p_name =request.getParameter("pname");
			out.println("Product Name :"+p_name +"<br><br>");
			
			String p_id =request.getParameter("pid");
			out.println("Product id :"+p_name +"<br><br>");
			
			String p_qty =request.getParameter("pqty");
			out.println("Product Quintity :"+p_qty +"<br><br>");
			
			String p_price =request.getParameter("price");
			out.println("Product Price :"+p_price +"<br><br>");
			
			
			%>
		</h1>
</body>
</html>