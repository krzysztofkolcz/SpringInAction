<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spittr</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <h1>Register</h1>
        <form:form method="POST" commandName="spitter">
        First Name: <form:input type="text" name="firstName" path="firstName" /><br/>
        Last Name: <form:input type="text" name="lastName" path="lastName" /><br/>
        Username: <form:input type="text" name="username" path="username" /><br/>
        Password: <form:input type="password" name="password" path="password" /><br/>
        <input type="submit" value="Register" />
        </form:form>
    </body>
</html>
