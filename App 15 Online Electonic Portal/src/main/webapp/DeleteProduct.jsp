<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: 'Poppins', sans-serif;
    }

    body{
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background: linear-gradient(135deg,#667eea,#764ba2);
    }

    .card{
        background:#ffffff;
        padding:40px;
        width:400px;
        border-radius:15px;
        box-shadow:0 15px 35px rgba(0,0,0,0.2);
        text-align:center;
        animation: fadeIn 1s ease-in-out;
    }

    .card h1{
        font-size:22px;
        margin-bottom:10px;
        color:#333;
    }

    .message{
        color:#555;
        margin-bottom:25px;
        font-size:14px;
    }

    .btn{
        display:block;
        text-decoration:none;
        padding:12px;
        margin:12px 0;
        border-radius:8px;
        font-weight:600;
        transition:0.3s;
        color:white;
    }

    .add{ background:#28a745; }
    .view{ background:#007bff; }
    .logout{ background:#dc3545; }

    .btn:hover{
        transform:translateY(-3px);
        box-shadow:0 8px 15px rgba(0,0,0,0.2);
        opacity:0.9;
    }

    @keyframes fadeIn{
        from{opacity:0; transform:translateY(30px);}
        to{opacity:1; transform:translateY(0);}
    }

    .welcome{
        font-size:18px;
        font-weight:600;
        margin-bottom:5px;
        color:#444;
    }
</style>
</head>

<body>

<%
    AdminBean abean = (AdminBean)session.getAttribute("abean");
    String data = (String)request.getAttribute("msg");
%>

<div class="card">
    
    <div class="welcome">
        Welcome, <%= abean.getA_fname() %> 👋
    </div>

    <div class="message">
        <%= data %>
    </div>

    <a href="AddProduct.html" class="btn add">➕ Add Product</a>
    <a href="View1" class="btn view">📋 View Products</a>
    <a href="logout" class="btn logout">🚪 Logout</a>

</div>

<script>
    // Small welcome animation effect
    window.onload = function() {
        console.log("Admin Dashboard Loaded Successfully");
    }
</script>

</body>
</html>