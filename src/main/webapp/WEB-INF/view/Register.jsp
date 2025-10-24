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


  <form:form action="${pageContext.request.contextPath}/Register" modelAttribute="user" >


    <div class="mb-3">
      <form:input path="firstName" type="text" class="form-control bg-light" placeholder="first name" />
      <form:errors path="firstName" cssClass="alert-danger"/>
    </div>

    <div class="mb-3">
      <form:input path="lastName" type="text" class="form-control bg-light" placeholder="last name " />
      <form:errors path="lastName" cssClass="alert-danger"/>
    </div>

    <div class="mb-3">
      <form:input path="email" class="form-control bg-light" placeholder="***@**.com" />
      <form:errors path="email" cssClass="alert-danger"/>

    </div>
    <div class="mb-3">
      <form:input path="password" type="text" class="form-control bg-light" placeholder="Enter password" />
      <form:errors path="password" cssClass="alert-danger"/>

    </div>
    <div class="mb-3">
      <form:password path="password_confirmed" class="form-control bg-light" />
      <form:errors path="password_confirmed" cssClass="alert-danger"/>

    </div>

    <div class="d-grid">
      <button type="submit" class="btn btn-danger btn-lg">Submit</button>
    </div>
  </form:form>
</div>


</body>
</html>
