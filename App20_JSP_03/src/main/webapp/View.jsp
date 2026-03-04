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
			<jsp:useBean id="ub" class="com.nit.pack1.UserBean" scope="session"/>
			UserName : <jsp:getProperty property="userName" name="ub"/><br><br>
			Mail_id : <jsp:getProperty property="userMail" name="ub"/><br><br>
			Mobile : <jsp:getProperty property="usermob" name="ub"/><br><br>
		</h1>
	</center>
</body>
</html>