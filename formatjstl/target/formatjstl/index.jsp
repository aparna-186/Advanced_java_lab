<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>JSTL Format Tag Example</title>
</head>
<body>
<h2>JSTL Formatting Example</h2>
<!-- Format Number -->
<p>Number:
    <fmt:formatNumber value="12345.678" pattern="#,##0.00" />
</p>
<!-- Format Currency -->
<p>Currency:
    <fmt:formatNumber value="12345.678" type="currency" />
</p>
<!-- Format Percentage -->
<p>Percentage:
    <fmt:formatNumber value="0.75" type="percent" />
</p>

<!-- Format Date -->
<p>Date:
    <fmt:formatDate value="<%= new java.util.Date() %>" pattern="dd-MM-yy HH:mm:ss" />
</p>
</body>
</html>
