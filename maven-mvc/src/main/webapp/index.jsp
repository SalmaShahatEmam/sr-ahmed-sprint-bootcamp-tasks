<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Products Data</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
            padding: 40px;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        table th, table td {
            vertical-align: middle;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 class="mb-4">Products Data</h3>

    <table class="table table-bordered table-hover">
        <thead class="table-dark">
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Show Details</th>
            <th>Add/Update</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>milk</td>
            <td><button class="btn btn-primary btn-sm">View Details</button></td>
            <td><button class="btn btn-warning btn-sm text-white">Add/update Details</button></td>
            <td><button class="btn btn-danger btn-sm">Delete</button></td>
        </tr>
        <tr>
            <td>2</td>
            <td>fish</td>
            <td><button class="btn btn-primary btn-sm">View Details</button></td>
            <td><button class="btn btn-warning btn-sm text-white">Add/update Details</button></td>
            <td><button class="btn btn-danger btn-sm">Delete</button></td>
        </tr>
        <tr>
            <td>3</td>
            <td>cheese</td>
            <td><button class="btn btn-primary btn-sm">View Details</button></td>
            <td><button class="btn btn-warning btn-sm text-white">Add/update Details</button></td>
            <td><button class="btn btn-danger btn-sm">Delete</button></td>
        </tr>
        <tr>
            <td>4</td>
            <td>chocolate</td>
            <td><button class="btn btn-primary btn-sm">View Details</button></td>
            <td><button class="btn btn-warning btn-sm text-white">Add/update Details</button></td>
            <td><button class="btn btn-danger btn-sm">Delete</button></td>
        </tr>
        </tbody>
    </table>

    <button class="btn btn-success">Add new salma</button>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
