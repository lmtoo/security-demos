<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>


<body>
<jsp:include page="WEB-INF/views/common/header.jsp"/>

<h2>Hello <b><sec:authentication property="principal.username" /></b>!</h2>

<jsp:include page="WEB-INF/views/common/footer.jsp"/>
</body>
</html>
