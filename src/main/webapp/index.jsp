<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/25
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="/add" method="get">
    username: <input type="text" name="username" /><br/>
    password: <input type="password" name="password"><br/>
    <input type="submit" value="submit"/>

</form>
<a href="/hello?name=zs&pass=123"> json 点击</a>
</body>
</html>
