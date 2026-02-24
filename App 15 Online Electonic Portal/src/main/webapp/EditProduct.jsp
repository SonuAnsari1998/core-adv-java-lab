		<%@page import="com.nit.pack1.ProductBean"%>
<%@page import="com.nit.pack1.AdminBean"%>
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
			AdminBean abean = (AdminBean)session.getAttribute("abean");
			ProductBean pb=(ProductBean) request.getAttribute("p_bean");
			out.println(abean.getA_fname()+" below is the data is available to Edit<br>");
		%>
		<form action="update" method="post">
		Product price <input type="text" name="pprice" value="<%=pb.getP_price() %>"> <br><br>
		Product Quantity <input type="text" name="pqty" value="<%=pb.getP_qty() %>"> <br><br>
		
		<input type="hidden" name="pcode" value="<%= pb.getP_code() %>>">
		<input type="submit" value="Update">
		</form>
	</h1>
	</center>
</body>
</html>