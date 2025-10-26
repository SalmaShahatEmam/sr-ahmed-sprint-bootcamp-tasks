<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <%--        import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <style>
        body {
            background-color: #f8f9fa;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            width: 100%;
            max-width: 500px;
            border-radius: 15px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        .btn-danger {
            background-color: #dc3545;
            border: none;
        }
        .btn-danger:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>

<div class="card p-4">
    <h2 class="text-center mb-4 fw-bold">User Form</h2>


    <form:form action="userdetails/store-user-details" modelAttribute="user" >


        <div class="mb-3">
            <form:input path="role" type="text" class="form-control bg-light" placeholder="Administrator" />
        </div>

        <div class="mb-3">
            <form:password path="password" class="form-control bg-light" />
        </div>

        <div class="mb-3">
            <form:select path="city" class="form-select">
                <form:option value="Brazil" label="Brazil" />
                <form:option value="Egypt" label="Egypt" />
                <form:option value="USA" label="USA" />
                <form:option value="Germany" label="Germany" />
                <form:option value="India" label="India" />
            </form:select>
        </div>

        <div class="mb-3">
            <label class="form-label fw-semibold">Preferred Programming Language</label><br>

            <div class="form-check form-check-inline">
                <form:radiobutton path="programming_lang" value="Java" class="form-check-input" id="langJava" />
                <label class="form-check-label" for="langJava">Java</label>
            </div>

            <div class="form-check form-check-inline">
                <form:radiobutton path="programming_lang" value="C#" class="form-check-input" id="langCSharp" />
                <label class="form-check-label" for="langCSharp">C#</label>
            </div>

            <div class="form-check form-check-inline">
                <form:radiobutton path="programming_lang" value="PHP" class="form-check-input" id="langPHP" />
                <label class="form-check-label" for="langPHP">PHP</label>
            </div>

            <div class="form-check form-check-inline">
                <form:radiobutton path="programming_lang" value="Ruby" class="form-check-input" id="langRuby" />
                <label class="form-check-label" for="langRuby">Ruby</label>
            </div>
        </div>

        <div class="mb-4">
            <label class="form-label fw-semibold">Preferred Operating System</label><br>

            <div class="form-check form-check-inline">
                <form:checkbox path="os" value="Linux" class="form-check-input" id="osLinux" />
                <label class="form-check-label" for="osLinux">Linux</label>
            </div>

            <div class="form-check form-check-inline">
                <form:checkbox path="os" value="Mac-OS" class="form-check-input" id="osMac" />
                <label class="form-check-label" for="osMac">Mac OS</label>
            </div>

            <div class="form-check form-check-inline">
                <form:checkbox path="os" value="MS-Windows" class="form-check-input" id="osWindows" />
                <label class="form-check-label" for="osWindows">MS Windows</label>
            </div>
        </div>


        <div class="d-grid">
            <button type="submit" class="btn btn-danger btn-lg">Submit</button>
        </div>
    </form:form>
</div>


</body>
</html>
