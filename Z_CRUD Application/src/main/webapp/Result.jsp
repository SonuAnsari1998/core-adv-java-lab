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
			String data = (String) request.getAttribute("msg");
			out.println(data+"<br><br>");
			%>
			
			<button>
				<a href="Add.html">Add Product</a>
			</button>
			<button>
				<a href="Update.html">Add Product</a>
			</button>
			<button>
				<a href="ViewServlet">Add Product</a>
			</button>
		</h1>
	</center>
</body>
</html>