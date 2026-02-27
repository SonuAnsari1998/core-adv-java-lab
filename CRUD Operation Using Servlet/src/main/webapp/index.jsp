<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management Dashboard</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: linear-gradient(to right, #1e3c72, #2a5298);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    .dashboard-card {
        width: 450px;
        border-radius: 20px;
        padding: 40px;
        background: #ffffff;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
        text-align: center;
    }

    .dashboard-card h1 {
        font-size: 28px;
        margin-bottom: 30px;
        font-weight: 600;
        color: #2a5298;
    }

    .btn-custom {
        width: 100%;
        margin-bottom: 15px;
        padding: 12px;
        font-size: 18px;
        border-radius: 10px;
        transition: 0.3s;
    }

    .btn-custom:hover {
        transform: translateY(-3px);
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }
</style>

</head>
<body>

<div class="dashboard-card">
    <h1><i class="bi bi-box-seam"></i> Product Management</h1>

    <a href="AddProduct.html" class="btn btn-success btn-custom">
        <i class="bi bi-plus-circle"></i> Add Product
    </a>

    <a href="Delete.html" class="btn btn-danger btn-custom">
        <i class="bi bi-trash"></i> Delete Product
    </a>

    <a href="Update.html" class="btn btn-warning btn-custom">
        <i class="bi bi-pencil-square"></i> Update Product
    </a>

    <a href="ViewServlet" class="btn btn-primary btn-custom">
        <i class="bi bi-eye"></i> View Products
    </a>
</div>

</body>
</html>