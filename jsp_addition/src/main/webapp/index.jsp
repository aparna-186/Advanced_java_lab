<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<%
    // Check if the parameters actually exist before trying to parse them
    String num1Param = request.getParameter("num1");
    String num2Param = request.getParameter("num2");

    if (num1Param != null && num2Param != null) {
        int num1 = Integer.parseInt(num1Param);
        int num2 = Integer.parseInt(num2Param);
        int sum = num1 + num2;
%>
<h2>Result of Addition</h2>
<p>The sum of <%= num1 %> and <%= num2 %> is: <b><%= sum %></b></p>
<%
} else {
%>

<%
    }
%>

</body>
</html>
