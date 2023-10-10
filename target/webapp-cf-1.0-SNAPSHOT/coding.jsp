<%--
  Created by IntelliJ IDEA.
  User: fildim
  Date: 24/7/2023
  Time: 8:30 μ.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2><%= request.getAttribute("codingTitle") %></h2>
    <h3>${ requestScope.codingTitle }</h3>

</body>
</html>
