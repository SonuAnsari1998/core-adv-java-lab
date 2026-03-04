<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.nit.pack1.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			<jsp:useBean id="ub" class="com.nit.pack1.UserBean" scope="session"></jsp:useBean>
			<jsp:setProperty property="userName" param="uname" name="ub" />
			<jsp:setProperty property="userMail" param="umid" name="ub" />
			<jsp:setProperty property="usermob" param="umob" name="ub" />
			Details Added to Bean Sucessfully!!!<br> <br> <a
				href="View.jsp">View Details</a>
		</h1>
	</center>
</body>
</html>