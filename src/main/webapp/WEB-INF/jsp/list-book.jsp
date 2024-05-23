<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <title>BOOKS LIST</title>
</head>

<body>
<jsp:include page="header.jsp" />
<div class="container">
    <h3>BOOKS LIST</h3>
    <hr>
    <a href="${pageContext.request.contextPath}/book/showFormForAdd" class="btn btn-primary btn-sm mb-3">
        Add Book
    </a>
    <form action="${pageContext.request.contextPath}/book/search" method="GET">
        <div class="form-row align-items-center">
            <div class="col">
                <label for="inlineFormInput"></label><input type="text" name="keyword" class="form-control mb-10" id="inlineFormInput"
                                                            placeholder="Book Name/Serial Name/Author/ISBN" required>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-success">Search</button>
                <a href="${pageContext.request.contextPath}/book/list" class="btn btn-warning">Clear</a>
            </div>
        </div>
    </form>
    <hr>
    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>Book Name</th>
            <th>Serial Name</th>
            <th>Books Author</th>
            <th>Books Description</th>
            <th>ISBN</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="tempBook" items="${books}">
            <tr>
                <td>${tempBook.bookName}</td>
                <td>${tempBook.serialName}</td>
                <td>${tempBook.booksAuthor}</td>
                <td>${tempBook.description}</td>
                <td>${tempBook.isbn}</td>
                <td>
                    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                        <!-- Add "update" button/link -->
                        <a href="${pageContext.request.contextPath}/book/showFormForUpdate?bookId=${tempBook.bookId}"
                           class="btn btn-info btn-sm mb-1">
                            Update
                        </a>
                    </c:if>
                    <!-- Add "delete" button/link -->
                    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                        <a href="${pageContext.request.contextPath}/book/delete?bookId=${tempBook.bookId}"
                           class="btn btn-danger btn-sm"
                           onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false">
                            Delete
                        </a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>

</html>
