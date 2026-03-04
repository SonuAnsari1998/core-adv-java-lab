<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="Error.jsp"%>
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
			String s = request.getParameter("choice");
			if ("Add".equals(s)) {
			%>
			<jsp:forward page="Addition.jsp">
				<jsp:param name="data" value="<%=new java.util.Date()%>" />
			</jsp:forward>
			<%
			} else {
			%>
			<jsp:forward page="Substraction.jsp">
				<jsp:param name="data" value="<%=new java.util.Date()%>" />
			</jsp:forward>
			<%
			}
			%>
		</h1>
	</center>
</body>
</html>