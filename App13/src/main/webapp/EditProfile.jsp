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
		out.println("This session belogns to "+uname+"<br><br>");
		out.println("<u>Edit Profile<u/><br><br>");
		%>
		<form action="update" method="post">
		Fist Name <input type="text" name="u_fname" value="<%= ub.getU_fname() %>>"><br><br>
		Last Name <input type="text" name="u_lname" value="<%= ub.getU_lname() %>>"><br><br>
		Mail Id <input type="text" name="u_mail" value="<%= ub.getU_mail() %>>"><br><br>
		Phone No <input type="text" name="u_phn" value="<%= ub.getU_phn() %>>"><br><br>
		<input type="submit" value="Update">
		</form>
		</h1>
		</center>
</body>
</html>