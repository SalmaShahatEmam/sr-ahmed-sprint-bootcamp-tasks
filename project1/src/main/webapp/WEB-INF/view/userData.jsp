<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Data</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <style>
        body {
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center; /* Vertical center */
            align-items: center;     /* Horizontal center */
            background-color: #f8f9fa;
        }

        .table-container {
            width: 80%;
            max-width: 800px;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        .btn-group-custom {
            margin-top: 20px;
        }
    </style>
</head>
<body>

<div class="table-container text-center">
    <table class="table table-striped table-bordered align-middle">
        <thead class="table-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Full Name</th>
            <th scope="col">Email</th>
            <th scope="col">City</th>
            <th scope="col">Date of Birth</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${full_name}</td>
            <td>${email}</td>
            <td>${city}</td>
            <td>${date_of_birth}</td>
        </tr>

        </tbody>
    </table>

    <div class="btn-group-custom">
        <a href="${pageContext.request.contextPath}/" class="btn btn-primary me-2">Age Calculator</a>
        <a href="${pageContext.request.contextPath}/getUserForm" class="btn btn-success">Register User</a>
    </div>
</div>

</body>
</html>
