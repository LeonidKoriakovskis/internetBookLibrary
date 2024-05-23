<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <title>Save Author</title>
</head>

<body>
<jsp:include page="header.jsp" />
<div class="container">
    <h3>Author Directory</h3>
    <hr>
    <p class="h4 mb-4">Save Author</p>
    
    <%--@elvariable id="authors" type="jakarta"--%>
    <form:form action="${pageContext.request.contextPath}/author/save" modelAttribute="authors" method="POST">
        <!-- Add hidden form field to handle update -->
        <form:hidden path="authorId" />
        <form:input path="authorName" class="form-control mb-4 col-4" placeholder="Author name" />
        <form:input path="description" class="form-control mb-4 col-4" placeholder="Description" />
        <button type="submit" class="btn btn-info col-2">Save</button>
    </form:form>
    <hr>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
