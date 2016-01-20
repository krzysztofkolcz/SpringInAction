<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <body>
        <h1>Your Profile</h1>
        <c:out value="${spitter.username}" /><br/>
        <c:out value="${spitter.firstName}" />
        <c:out value="${spitter.lastName}" />
    </body>
</html>
