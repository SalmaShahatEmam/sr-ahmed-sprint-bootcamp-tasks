<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/11/2025
  Time: 12:06 ص
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <!-- Header -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h3 class="fw-bold">Product Details</h3>
        <a href="all" class="btn btn-secondary">Back</a>
    </div>

    <!-- Product Card -->
    <div class="card shadow-sm border-0 rounded-3">
        <div class="card-body">
            <h4 class="card-title mb-3">${product.name}</h4>

            <div class="row mb-2">
                <div class="col-md-3 fw-bold">Product ID:</div>
                <div class="col-md-9">${product.id}</div>
            </div>

            <div class="row mb-2">
                <div class="col-md-3 fw-bold">manufacturer:</div>
                <div class="col-md-9">${details.manufacturer}</div>
            </div>

            <div class="row mb-2">
                <div class="col-md-3 fw-bold">Price:</div>
                <div class="col-md-9">${details.price}</div>
            </div>

            <div class="row mb-2">
                <div class="col-md-3 fw-bold">Expire date:</div>
                <div class="col-md-9">${details.expirationDate}</div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3 fw-bold">in Stock:</div>
                <div class="col-md-9">${details.availability == 1? 'yes' : 'no'}</div>
            </div>

            <div class="row mb-2">
                <div class="col-md-3 fw-bold">Description:</div>
                <div class="col-md-9">
                    ${details.description}
                </div>
            </div>

            <!-- Buttons -->
            <div class="mt-4">
                <a href="edit/${product.id}" class="btn btn-warning text-dark me-2">Edit</a>
                <a href="delete/${product.id}"  class="btn btn-danger">Delete</a>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
