<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
    <div class="container-fluid">
        <h3>Age Calculator</h3>
    </div>
    <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
        <div class="p-4 bg-light border rounded">
            <form action="processForm">
                <div class="mb-3">
                    <label for="day" class="form-label">Day</label>
                    <input type="text" class="form-control" id="day" name="day">
                </div>
                <div class="mb-3">
                    <label for="month" class="form-label">Month</label>
                    <input type="text" class="form-control" id="month" name="month">
                </div>
                <div class="mb-3">
                    <label for="year" class="form-label">Year</label>
                    <input type="text" class="form-control" id="year" name="year">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form></div>
        </div>
    </body>
</html>

