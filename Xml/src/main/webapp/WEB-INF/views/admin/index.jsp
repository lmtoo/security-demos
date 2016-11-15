<%--
  Created by IntelliJ IDEA.
  User: hjtf
  Date: 2016/11/10 0010
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/><br>
Hello! <sec:authentication property="principal.username"/><br>
这里是受保护的管理界面

<sec:authorize access="hasRole('ADMIN')">
    只有admin的角色才能访问此内容
</sec:authorize>
<br>
<sec:authorize access="hasRole('securit')">
    只有securit的角色才能访问此内容
</sec:authorize>
<br>
<sec:authorize access="hasAuthority('admin:ddd:index')">
    这里是验证权限的地方
</sec:authorize>
<br>

<jsp:include page="../common/footer.jsp"/>
</body>
</html>
