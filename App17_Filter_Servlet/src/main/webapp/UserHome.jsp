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
				UserBean ub =(UserBean)request.getAttribute("userBean");
			out.println("<u>User Data</u><br><br>");
			
			out.println("UserName: "+ub.getU_name()+"<br><br>");
			String  pwd=ub.getU_pwd();
			String cpwd=pwd.substring(0, 1)+"****"+pwd.substring(pwd.length()-1);
			
			out.println("Password: "+cpwd+"<br><br>");
			out.println("First Name: "+ub.getU_fname()+"<br><br>");
			out.println("Last Name: "+ub.getU_lname()+"<br><br>");
			out.println("Mail Id: "+ub.getU_mail()+"<br><br>");
			out.println("Phone No."+ub.getU_phn()+"<br><br>");
			%>
		</h1>
	</center>
</body>
</html>