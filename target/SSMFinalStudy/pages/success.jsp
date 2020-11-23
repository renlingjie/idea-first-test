<%--
  Created by IntelliJ IDEA.
  User: renlingjie
  Date: 2020/11/14
  Time: 9:25 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--引入JSTL标签库-->
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h5>恭喜成功跳转，最终操作Dao得到的结果为：</h5>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}<br>
    </c:forEach>
</body>
</html>
