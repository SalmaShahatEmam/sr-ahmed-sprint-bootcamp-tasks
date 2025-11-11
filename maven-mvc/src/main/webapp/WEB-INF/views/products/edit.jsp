<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/11/2025
  Time: 12:31 ص
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Update Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h3 class="mb-4 fw-bold text-center">Update Product</h3>

                    <form action="${pageContext.request.contextPath}/products/update" method="post">
                        <!-- Product Name -->
                        <div class="mb-3">
                            <label for="name" class="form-label">Product Name</label>
                            <input type="text" class="form-control" id="name" name="name" placeholder="Enter product name" value="${product.name}" >
                        </div>

                        <div class="mb-3">
                            <label for="description" class="form-label">Product description</label>
                            <input type="text" class="form-control" id="description" name="description" placeholder="Enter product name" value="${details.description}" >
                        </div>

                        <input type="hidden" name="id" value="${product.id}">
                        <!-- Expiration Date -->
                        <div class="mb-3">
                            <label for="expirationDate" class="form-label">Expiration Date</label>
                            <input type="date" class="form-control" id="expirationDate" name="expirationDate" value="${details.expirationDate}">
                        </div>

                        <!-- Manufacturer -->
                        <div class="mb-3">
                            <label for="manufacturer" class="form-label">Manufacturer</label>
                            <input type="text" class="form-control" id="manufacturer" name="manufacturer" placeholder="Manufacturer" value="${details.manufacturer}" >
                        </div>

                        <!-- Price -->
                        <div class="mb-3">
                            <label for="price" class="form-label">Price</label>
                            <input type="number" step="0.01" class="form-control" id="price" name="price" placeholder="Price" value="${details.price}" >
                        </div>

                        <!-- Availability -->
                        <div class="mb-3">
                            <label for="availability" class="form-label">Availability</label>
                            <select class="form-select" id="availability" name="availability" >
                                <option value="">Choose...</option>
                                <option value="1" ${details.availability == 1 ? selected : ''}>Available</option>
                                <option value="0" ${details.availability != 1 ? selected : ''}>Unavailable</option>
                            </select>
                        </div>

                        <!-- Submit Button -->
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>

                        <!-- Back Button -->
                        <div class="text-center mt-3">
                            <a href="/products" class="btn btn-secondary">Back</a>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
