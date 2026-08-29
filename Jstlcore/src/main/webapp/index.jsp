<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL Core Tags Demonstration</title>
</head>
<body>
<h2>JSTL Core Tags Example</h2>
<c:set var="name" value="Rama" />
<p>Student name: <c:out value="${name}" /></p>
<c:set var="marks" value="75" />
<c:if test="${marks >= 40}">
    <p>Status: Pass</p>
</c:if>
<c:choose>
    <c:when test="${marks >= 90}">
        <p>Grade: A</p>
    </c:when>
    <c:when test="${marks >= 60}">
        <p>Grade: B</p>
    </c:when>
    <c:when test="${marks >= 40}">
        <p>Grade: C</p>
    </c:when>
    <c:otherwise>
        <p>Grade: Fail</p>
    </c:otherwise>
</c:choose>
<h3>Subjects:</h3>
<c:set var="subjects" value="${['C', 'C++', 'Java', 'Python']}" />
<ul>
    <c:forEach var="sub" items="${subjects}">
        <li><c:out value="${sub}" /></li>
    </c:forEach>
</ul>
</body>
</html>
