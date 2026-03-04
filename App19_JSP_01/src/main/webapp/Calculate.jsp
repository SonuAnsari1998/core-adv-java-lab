<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int findFactorial(int x){
		
		int fact=1;
		for(; x>=1; x--)
			fact=fact*x;
		
			return fact;
	}
	%>
	
	<%
		int i=Integer.parseInt(request.getParameter("num"));
	int result=findFactorial(i);
	out.println("<center><h1>Factorial is: "+result+"</h1></center>");
	%>
	
	<%@ include file="index.html" %>
</body>
</html>