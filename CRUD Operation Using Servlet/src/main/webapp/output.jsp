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
			String data = (String)request.getAttribute("msg");
			if(data!=null){
				out.println(data+"<br><br>");
			}
		%>
		<a href="AddProduct.html">Add Product</a><br><br>
		<a href="Delete.html">Delete Product</a><br><br>
		<a href="Update.html">Update Product</a><br><br>
		<a href="View.html">View Product</a>
	</h1>
	</center>
</body>
</html>