<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div><p>Danh sách sách</p></div>
<table class="table table-bordered table-striped">
    <thead class="thead-dark">
    <tr>
        <th>Mã mượn sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Tên học sinh</th>
        <th>Lớp</th>
        <th>Ngày mượn</th>
        <th>Ngày trả</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${list}" varStatus="s">
        <tr>
            <td><c:out value="${book.id_borrow}"/></td>
            <td><c:out value="${book.name_book}"/></td>
            <td><c:out value="${book.author_book}"/></td>
            <td><c:out value="${book.name_student}"/></td>
            <td><c:out value="${book.clas}"/></td>
            <td><c:out value="${book.date_borrow}"/></td>
            <td><c:out value="${book.date_return}"/></td>
            <td>
                <button class="btn btn-warning">Trả sách</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

</body>
</html>
