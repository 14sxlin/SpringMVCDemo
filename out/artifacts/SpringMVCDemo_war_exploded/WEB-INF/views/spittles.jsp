<%--
  Created by IntelliJ IDEA.
  User: sparr
  Date: 2017/3/21
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <ul>
        <c:forEach items="${spittleList}" var="spittle">
            <li id="spittle_<c:out value="${spittle.id}"></c:out> ">
                <div>
                    <c:out value="${spittle.message}"></c:out>
                </div>
                <div>
                    <span><c:out value="${spittle.time}"></c:out></span>
                    <span>(<c:out value="${spittle.latitude}"></c:out>,
                            <c:out value="${spittle.longitude}"></c:out> )</span>
                </div>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
