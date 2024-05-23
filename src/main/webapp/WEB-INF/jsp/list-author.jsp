<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <title>AUTHORS LIST</title>
</head>

<body>
<jsp:include page="header.jsp" />
<div class="container">
    <h3>AUTHORS LIST</h3>
    <hr>
    <a href="${pageContext.request.contextPath}/author/showFormForAdd" class="btn btn-primary btn-sm mb-3">
        Add Author
    </a>
    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>Author Name</th>
            <th>Description</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="tempAuthor" items="${authors}">
            <tr>
                <td>${tempAuthor.authorName}</td>
                <td>${tempAuthor.description}</td>
                <td>
                    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                        <!-- Add "update" button/link -->
                        <a href="${pageContext.request.contextPath}/author/showFormForUpdate?authorId=${tempAuthor.authorId}"
                           class="btn btn-info btn-sm">
                            Update
                        </a>
                    </c:if>
                    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
                        <!-- Add "delete" button/link -->
                        <a href="${pageContext.request.contextPath}/author/delete?authorId=${tempAuthor.authorId}"
                           class="btn btn-danger btn-sm"
                           onclick="if (!(confirm('Are you sure you want to delete this author?'))) return false">
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

