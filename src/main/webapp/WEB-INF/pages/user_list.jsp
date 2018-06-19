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

    <a href="/">Home</a>

    <table border="1">
        <th>id</th>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>

        <c:forEach var="user" items="${listUser}">
            <tr>
                <td>${user.id}</td>
                <td>${user.email}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>

                <td>
                    <a href="{userId}/events">Show Events</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    </h4>
</div>
</body>
</html>