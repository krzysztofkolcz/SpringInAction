<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Input Stream</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
      <c:out value="${webrequest}"/>
      <c:out value="${locale}"/>
      <c:out value="${timezone}"/>
      <c:out value="${inputstream}"/>
      <c:out value="${outputstream}"/>
      <c:out value="${httpmethod}"/>
      <c:out value="${principal}"/>
      <c:out value="${inputId}"/>
      <c:out value="${matrix1}"/>
      <c:out value="${matrix2}"/>
      <c:out value="${reqParam}"/>
      <c:out value="${reqHeader}"/>
      <c:out value="${reqBody}"/>
      <c:out value="${reqPart}"/>
      <c:out value="${input}"/>
      <c:out value="${inputStream}"/>
    </body>
</html>

