<%@page import="java.util.Iterator"%>
<%@page import="com.nit.pack1.EmpBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
	<u> Employee Data</u>
	<h3>
		<%
		ArrayList<EmpBean> al = (ArrayList<EmpBean>)request.getAttribute("list");
		if(al.size()==0){
			out.println("Employee table is Empty");
		}else{
			Iterator<EmpBean> i = al.iterator();
			while(i.hasNext()){
				EmpBean eb=i.next();
				out.println(eb.getEmp_id()+"\t"+eb.getEmp_fname()+"\t"+eb.getEmp_lname()+"\t"+eb.getEmp_sal()+"t"+eb.getEmp_address()+"<br><br>");
			}
		}
		%>
		
	</h3>
	</h1>
</body>
</html>