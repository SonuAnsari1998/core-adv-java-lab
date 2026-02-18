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
		String uname = (String)request.getAttribute("user_name");
		UserBean ub = (UserBean)application.getAttribute("userBean");
		
		out.println("This Session belogns to "+uname+"<br><br>");
		out.println("<u>Profile Details <u/> <br> <br>");
		String pwd = ub.getU_pwd();
		String ecryptPass = pwd.substring(0,1)+"*****"+pwd.substring(pwd.length()-1);
		
		out.println(ub.getU_name()+" "+ecryptPass+" "+ub.getU_fname()+" "+ub.getU_lname()+" "+ub.getU_mail()+" "+ub.getU_phn()+"<br><br>");
		
		%>
		<a href="edit">Edit</a><br><br>s
		<a href="logout">Logout</a><br><br>
		
		</h1>
	</center>
</body>
</html>