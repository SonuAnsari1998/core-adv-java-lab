<%@page import="com.nit.pack1.ProductBean"%>
<%@page import="java.util.*"%>
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
		 ArrayList<ProductBean> al=(ArrayList<ProductBean>) session.getAttribute("productList");
		 if(al.size()==0){
			 out.println("Product are Not available in the Inventory");
		 }else{
			 out.println("Hello Mr. "+abean.getA_fname()+"these are your product Details <br><br>");
		 Iterator<ProductBean> i= al.iterator();
		while(i.hasNext()){
			ProductBean pb=i.next();
			out.println(pb.getP_code()+" "+pb.getP_name()+" "+pb.getP_company()+" "+pb.getP_price()+" "+pb.getP_qty()+" "
			
			+"<a href ='edit?pcode="+pb.getP_code()+"'>Edit</a>"+""
			+"<a href ='delete?pcode="+pb.getP_code()+"'>Delete</a>"+"<br><br>");
		}
		 }
		%>
	</h1>
	</center>
</body>
</html>