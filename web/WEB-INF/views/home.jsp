<%--
  Created by IntelliJ IDEA.
  User: sparr
  Date: 2017/3/21
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
    <h1>Weilcome to Spittr</h1>
    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
