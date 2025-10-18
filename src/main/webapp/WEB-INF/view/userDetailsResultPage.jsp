<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details Result</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f7f8fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #333;
        }
        .card {
            max-width: 600px;
            margin: 80px auto;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        }
        .card-header {
            background-color: #dc3545;
            color: white;
            border-top-left-radius: 15px;
            border-top-right-radius: 15px;
        }
        .info-label {
            font-weight: 600;
            color: #555;
        }
        .info-value {
            color: #212529;
        }
    </style>
</head>
<body>

<div class="card">
    <div class="card-header text-center py-3">
        <h3 class="mb-0">User Details Summary</h3>
    </div>
    <div class="card-body">
        <div class="mb-3">
            <span class="info-label">Role:</span>
            <span class="info-value">${userModelResult.role}</span>
        </div>
        <div class="mb-3">
            <span class="info-label">City:</span>
            <span class="info-value">${userModelResult.city}</span>
        </div>
        <div class="mb-3">
            <span class="info-label">Programming Language:</span>
            <span class="info-value">${userModelResult.programming_lang}</span>
        </div>
        <div class="mb-3">
            <span class="info-label">Operating Systems:</span>
            <span class="info-value">

                    <span class="badge bg-secondary me-1">${userModelResult.os.toString()}</span>

            </span>
        </div>
    </div>

    <div class="card-footer text-center">
        <a href="/studentApp/userdetails" class="btn btn-outline-danger px-4">← Back to Form</a>
    </div>
</div>

</body>
</html>
