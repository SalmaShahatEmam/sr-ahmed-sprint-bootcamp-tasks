<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error {
            color: red;
            font-size: 0.9rem;
        }
    </style>
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm border-0">
                <div class="card-body">
                    <h3 class="mb-4 fw-bold text-center">Add Product</h3>

                    <form:form action="${pageContext.request.contextPath}/products/saveProduct" method="post" modelAttribute="productDto">
                        <!-- Product Name -->
                        <div class="mb-3">
                            <label for="name" class="form-label">Product Name</label>
                            <form:input path="name" cssClass="form-control" id="name" placeholder="Enter product name"/>
                            <form:errors path="name" cssClass="error"/>
                        </div>

                        <!-- Description -->
                        <div class="mb-3">
                            <label for="description" class="form-label">Product Description</label>
                            <form:input path="description" cssClass="form-control" id="description" placeholder="Enter product description"/>
                            <form:errors path="description" cssClass="error"/>
                        </div>

                        <!-- Expiration Date -->
                        <div class="mb-3">
                            <label for="expirationDate" class="form-label">Expiration Date</label>
                            <form:input path="expirationDate" cssClass="form-control" id="expirationDate" type="date"/>
                            <form:errors path="expirationDate" cssClass="error"/>
                        </div>

                        <!-- Manufacturer -->
                        <div class="mb-3">
                            <label for="manufacturer" class="form-label">Manufacturer</label>
                            <form:input path="manufacturer" cssClass="form-control" id="manufacturer" placeholder="Manufacturer"/>
                            <form:errors path="manufacturer" cssClass="error"/>
                        </div>

                        <!-- Price -->
                        <div class="mb-3">
                            <label for="price" class="form-label">Price</label>
                            <form:input path="price" cssClass="form-control" id="price" type="number" step="0.01" placeholder="Price"/>
                            <form:errors path="price" cssClass="error"/>
                        </div>

                        <!-- Availability -->
                        <div class="mb-3">
                            <label for="availability" class="form-label">Availability</label>
                            <form:select path="availability" cssClass="form-select" id="availability">
                                <form:option value="" label="Choose..."/>
                                <form:option value="1" label="Available"/>
                                <form:option value="0" label="Unavailable"/>
                            </form:select>
                            <form:errors path="availability" cssClass="error"/>
                        </div>

                        <!-- Submit Button -->
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>

                        <!-- Back Button -->
                        <div class="text-center mt-3">
                            <a href="${pageContext.request.contextPath}/products" class="btn btn-secondary">Back</a>
                        </div>
                    </form:form>

                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
