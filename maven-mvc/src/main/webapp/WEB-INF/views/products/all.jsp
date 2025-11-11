<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            margin: 40px;
        }
        table {
            background: #fff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        th {
            background-color: #212529;
            color: white;
            text-align: center;
        }
        td {
            text-align: center;
            vertical-align: middle;
        }
        .btn {
            border-radius: 8px;
            padding: 6px 14px;
            font-weight: 500;
        }
        .btn-view { background-color: #0d6efd; color: #fff; }
        .btn-update { background-color: #ffc107; color: #000; }
        .btn-delete { background-color: #dc3545; color: #fff; }
        .btn-add { background-color: #198754; color: #fff; margin-top: 20px; }
    </style>
</head>
<body>
<div class="container">
    <h2 class="mb-4">Products Data</h2>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Show Details</th>
            <th>Add/Update</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${products}" varStatus="loop">
            <tr>
                <td>${loop.index + 1}</td>
                <td>${p.name}</td>
                <td>
                    <a href="${p.id}" class="btn btn-view">View Details</a>
                </td>
                <td>
                    <a href="edit/${p.id}" class="btn btn-update">update Details</a>
                </td>
                <td>
                    <a href="delete/${p.id}" class="btn btn-delete"
                       onclick="return confirm('Are you sure you want to delete this product?');">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <a href="${pageContext.request.contextPath}/products/create" class="btn btn-add">Add new Product</a>
</div>
</body>
</html>
