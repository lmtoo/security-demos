<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<body>
<h2>Hello <b><sec:authentication property="principal.username" /></b>!</h2>




<form action="/logout" method="get">
    <input type="submit" value="logout"/>
</form>
</body>
</html>
