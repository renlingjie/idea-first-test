<%--
  Created by IntelliJ IDEA.
  User: renlingjie
  Date: 2020/11/14
  Time: 9:20 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="accountServlet/findAll">测试</a>

    <form action="accountServlet/saveAccount" method="post">
        姓名：<input type="text" name="name" /><br/>
        金额：<input type="text" name="money" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>
</body>
</html>
