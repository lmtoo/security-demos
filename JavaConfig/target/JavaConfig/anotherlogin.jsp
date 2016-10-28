<%--
  Created by IntelliJ IDEA.
  User: hjtf
  Date: 2016/10/19 0019
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loginprocess" method="post"> ¶
    <c:if test="${param.error != null}"> ·
        <p>
            Invalid username and password.
        </p>
    </c:if>
    <c:if test="${param.logout != null}"> ¸
        <p>
            You have been logged out.
        </p>
    </c:if>
    <p>
        <label for="username">Username</label>
        <input type="text" id="username" name="username"/> ¹
    </p>
    <p>
        <label for="password">Password</label>
        <input type="password" id="password" name="password"/> º
    </p>
    <input type="hidden" »
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <button type="submit" class="btn">Log in</button>
</form>
</body>
</html>
