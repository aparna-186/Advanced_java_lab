<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>JSTL Function Tags Example</title>
</head>
<body>
<h2>JSTL Function Tag Demonstration</h2>
<!-- Set a string value -->
<c:set var="msg" value=" hello world " />
<!-- Display original message -->
<p>Original Message: [${msg}]</p>
<!-- Trimmed message -->
<p>Trimmed: [${fn:trim(msg)}]</p>
<!-- Convert to uppercase -->
<p>Uppercase: ${fn:toUpperCase(msg)}</p>
<!-- Find length of string -->
<p>Length of msg: ${fn:length(msg)}</p>
<!-- Replace characters -->
<p>Replace 'o' with 'x': ${fn:replace(msg, 'o', 'x')}</p>
</body>
</html>
