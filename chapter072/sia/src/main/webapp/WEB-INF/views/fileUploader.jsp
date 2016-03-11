<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring 4 MVC File Upload Example</title>
</head>
<body> 
 
    <div class="form-container">
        <h1>Spring 4 MVC File Upload Example </h1>
        <form:form method="POST" modelAttribute="fileBucket" enctype="multipart/form-data" >
            <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif" />
            <input type="submit" value="Upload" class="btn btn-primary btn-sm">
        </form:form>
    </div>
</body>
</html>
