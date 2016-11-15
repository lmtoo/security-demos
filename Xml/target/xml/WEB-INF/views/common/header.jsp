<%--
  Created by IntelliJ IDEA.
  User: hjtf
  Date: 2016/11/14 0014
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<form action="/logout" method="post">
    <sec:csrfInput/>
    <input type="submit" value="注销"/>
</form>
<a href="/users/changePassword">修改密码</a>