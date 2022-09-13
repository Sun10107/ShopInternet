<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <p align="center">
        WELCOME TO YUMMY STUFF STORE
    </p>

    <p align="center">
        To continue please register.
    </p>
    <p align="center">
        Already have an account? Please Sign up to continue.
    </p>

</head>

<form action = "/registration" method = "get">
    <p>
    Create account:
    <input type="submit" value="Registration">
    </p>
</form>
<form action = "/catalog" method="get">
    <p>
    Already have account?
    <input type="submit" value="Sign Up!">
    </p>
</form>
<%--<p align = "center">--%>
<%--    CHECK HOW MUCH YUMMY STUFF THERE ARE IN THE STORE!</p>--%>

<%--<form action = "/catalog" mtehod = "post">--%>
<%--    <p align="center">--%>
<%--    <input type = "submit" value="Show me your yummy!" style = "width: 900px; height: 200px;"/>--%>
<%--    </p>--%>
<%--</form>--%>

</body>
</html>