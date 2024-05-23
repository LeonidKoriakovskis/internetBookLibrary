<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE HTML>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <title>Save Publisher</title>
</head>

<body>
<jsp:include page="header.jsp" />
<div class="container">

    <h3>Publisher Directory</h3>
    <hr>

    <p class="h4 mb-4">Save Publisher</p>

    <form:form action="${pageContext.request.contextPath}/publisher/save" modelAttribute="publishers" method="POST">

        <!-- Add hidden form field to handle update -->
        <form:hidden path="publisherId" id="publisherId" />

        <div class="form-group">
            <label for="publisherName">Publisher Name:</label>
            <form:input path="publisherName" id="publisherName" cssClass="form-control mb-4 col-4" placeholder="Publisher name" />
        </div>

        <div class="form-group">
            <label for="description">Description:</label>
            <form:input path="description" id="description" cssClass="form-control mb-4 col-4" placeholder="Description" />
        </div>

        <button type="submit" class="btn btn-info col-2">Save</button>
    </form:form>
    <hr>
</div>
</body>

</html>
