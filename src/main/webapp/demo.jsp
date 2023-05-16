<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: KTC
  Date: 5/16/2023
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kach Hang</title>
</head>
<body>
<h1>Danh Sach Khach Hang</h1>
<table border="1px">
  <tr>
    <th>Ten</th>
    <th>Ngay Sinh</th>
    <th>Dia Chi</th>
    <th>Anh</th>
  </tr>
<jsp:useBean id="khachHangs" scope="request" type="java.util.List"/>
<c:forEach var="khachHang" items="${khachHangs}">
  <tr>
    <td>${khachHang.getName()}</td>
    <td>${khachHang.getBirthday()}</td>
    <td>${khachHang.getAddress()}</td>
    <td><img src="${khachHang. getPhoto() }" /></td>
  </tr>
</c:forEach>

</table>
</body>
</html>
