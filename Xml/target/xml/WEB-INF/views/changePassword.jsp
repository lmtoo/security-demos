<%--
  Created by IntelliJ IDEA.
  User: hjtf
  Date: 2016/11/14 0014
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:include page="common/header.jsp"/>
<form action="/users/changePassword" method="post">
    <sec:csrfInput/>
    旧密码：<input type="password" name="oldPassword"><br>
    新密码：<input type="password" name="newPassword"><br>
    <input type="submit" value="修改密码"/>
</form>
<jsp:include page="common/footer.jsp"/>
</body>
</html>
