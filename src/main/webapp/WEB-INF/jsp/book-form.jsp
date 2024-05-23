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
    <title>Save Book</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="container">
    <h3>Book Directory</h3>
    <hr>
    <p class="h4 mb-4">Save Book</p>
    <form:form action="${pageContext.request.contextPath}/book/save" modelAttribute="books" method="POST">
        <!-- Add hidden form field to handle update -->
        <form:hidden path="bookId" />

        <div class="form-group">
            <label for="bookName">Book Name:</label>
            <form:input path="bookName" id="bookName" cssClass="form-control mb-4 col-4" placeholder="Book name" />
        </div>

        <div class="form-group">
            <label for="serialName">Serial Name:</label>
            <form:input path="serialName" id="serialName" cssClass="form-control mb-4 col-4" placeholder="Serial Name" />
        </div>

        <div class="form-group">
            <label for="booksAuthor">Book's Author:</label>
            <form:input path="booksAuthor" id="booksAuthor" cssClass="form-control mb-4 col-4" placeholder="Book's Author" />
        </div>

        <div class="form-group">
            <label for="description">Description:</label>
            <form:input path="description" id="description" cssClass="form-control mb-4 col-4" placeholder="Description" />
        </div>

        <div class="form-group">
            <label for="isbn">ISBN:</label>
            <form:input path="isbn" id="isbn" cssClass="form-control mb-4 col-4" placeholder="ISBN" />
        </div>

        <button type="submit" class="btn btn-info col-2">Save</button>
    </form:form>
    <hr>
</div>
</body>
</html>
