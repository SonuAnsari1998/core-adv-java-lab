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
		String uname = (String)request.getAttribute("msg");
		UserBean ub = (UserBean)application.getAttribute("msg");
		
		out.println("This Session belogns to "+uname+"<br><br>");
		out.println("<u>Profile Details <u/> <br> <br>");
		String pwd = ub.getU_pwd();
		String ecryptPass = pwd.substring(0,1)+"*****"+pwd.substring(pwd.length()-1);
		
		out.println("Username: "+ub.getU_name()+"<br>Password: "+ecryptPass+"<br>First Name: "+ub.getU_fname()+"<br>Last Name: "+ub.getU_lname()+"<br>Email Id: "+ub.getU_mail()+"<br>Phone No. : "+ub.getU_phn()+"<br><br>");
		
		%>
		<a href="edit">Edit</a><br><br>
		<a href="logout">Logout</a><br><br>
		
		</h1>
	</center>
</body>
</html>