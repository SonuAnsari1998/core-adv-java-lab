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
			String uname = (String) request.getParameter("uname");
			String msg1 = (String) application.getAttribute("msg1");
			String msg2 = (String)	application.getInitParameter("msg2");
			String s_name = (String) request.getAttribute("servletName");
			String msg3 = (String) request.getAttribute("msg3");
			
			out.println("Welcome "+uname+"<br><br>");
			out.println("ServletContext: "+msg1+"(From Servlet)<br><br>");
			out.println("");
			
			
			
			
			
 			%>
		</h1>
	</center>
</body>
</html>