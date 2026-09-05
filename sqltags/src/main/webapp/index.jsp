<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>

<head>
    <title>JSTL SQL Tags - Student Records</title>
</head>

<body>

<h2>Student Records Using JSTL SQL Tags</h2>

<sql:setDataSource var="school_db"
                   driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/ap"
                   user="root"
                   password="root" />

<sql:query var="students" dataSource="${school_db}">
    SELECT * FROM students
</sql:query>

<h3>Student Records</h3>

<table border="1" cellpadding="5" cellspacing="0">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Grade</th>
    </tr>

    <c:forEach var="row" items="${students.rows}">

        <tr>
            <td><c:out value="${row.id}" /></td>
            <td><c:out value="${row.name}" /></td>
            <td><c:out value="${row.grade}" /></td>
        </tr>

    </c:forEach>

</table>

</body>

</html>