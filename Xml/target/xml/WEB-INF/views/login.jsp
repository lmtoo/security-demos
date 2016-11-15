<%--
  Created by IntelliJ IDEA.
  User: hjtf
  Date: 2016/11/10 0010
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="common/header.jsp"/>

<form action="/login" method="post" >
    <sec:csrfInput/>
    用户名： <input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    记住我：<input type="checkbox" name="remember-me" value="1"/><br>
    <input type="submit" value="登陆">
</form>

<jsp:include page="common/footer.jsp"/>
</body>
</html>
