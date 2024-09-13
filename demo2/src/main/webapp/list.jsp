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
            <th>#</th>
            <th>Mã sách</th>
            <th>Tên sách</th>
            <th>tác giả</th>
            <th>Số luong </th>
            <th>Mô tả</th>
            <th>Hành động</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${list}" varStatus="s">
            <tr>
                <td><c:out value="${s.count}"/></td>
                <td><c:out value="${book.id_book}"/></td>
                <td>
                    <c:out value="${book.name_book}"/>
                </td>
                <td><c:out value="${book.author_book}"/></td>
                <td>
                    <c:out value="${book.description_book}"/>
                </td>
                <td><c:out value="${book.quantity_book}"/></td>
                <td>
                 <button class="btn btn-warning">Muon</button>

                </td>

                <a href="borrow?action="><button class="btn btn-warning">Danh sách mượn</button></a>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <p> Bạn có muốn xoá không</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <a href="controller?action=delete&id=${product.id}"><button type="button" class="btn btn-primary">xoá</button></a>

                            </div>
                        </div>
                    </div>
                </div>
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
