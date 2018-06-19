<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Eventy</title>
</head>
<body>
<div align="left">
    <h1>Eventy</h1>

    <h4>Logged in as<a href="user/${user.id}">${user.firstName} ${user.lastName}</a></h4>

    <h4><a href="auth/signUpForm">Sign Up</a></h4>
    <h4><a href="auth/loginForm">Login</a></h4>
    <h4><a href="users">List Users</a></h4>
    <h4><a href="events">All Events</a></h4>

</div>
</body>
</html>