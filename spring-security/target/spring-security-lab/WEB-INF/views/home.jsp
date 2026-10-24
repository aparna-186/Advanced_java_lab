
<html>
<body>

    <h2>Spring Security Example</h2>

    <h3>${message}</h3>

    <a href="${pageContext.request.contextPath}/admin">
        Open Admin Page
    </a>

    <br><br>

    <form action="${pageContext.request.contextPath}/logout"
          method="post">

        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}">

        <input type="submit" value="Logout">

    </form>

</body>
</html>
