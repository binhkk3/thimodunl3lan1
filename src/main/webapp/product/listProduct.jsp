<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binhd
  Date: 12/9/2021
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/customers?action=create">$nhan$</a>
<a href="/customers?action=Sort">sắp xếp tuoi</a>
<form action="/customers">
    <input type="text" name="key">
    <button>tim</button>
</form>
<c:forEach var="action" items="${dssp}">
    <h2>${action.nameProduct},${action.price},${action.quantity},${action.clor},${action.description},${action.category}</h2>
</c:forEach>
</body>
</html>
