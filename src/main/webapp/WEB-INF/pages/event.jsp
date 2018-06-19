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
    <a href="/">Home</a>
    <a href="${event.id}/updateEventForm">Edit</a>
    <a href="${event.id}/delete">Delete</a>
    <a href="${event.id}/members/${user.id}">Enroll</a>

    <h4>Title: ${event.title}</h4>
    <h4>Category: ${event.category}</h4>
    <h4>Location: ${event.locationText}</h4>
    <h4>Day: ${event.day}</h4>
    <h4>Start: ${event.startTime}</h4>
    <h4>End: ${event.endTime}</h4>
    <h4>Description: ${event.description}</h4>
    <h4>Requirement: ${event.requirement}</h4>

    <h4></h4>
    <h4></h4>
    <h4>Members:</h4>
    <table border="1">
        <th>id</th>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>

        <c:forEach var="u" items="${listUser}">
            <tr>
                <td>${u.id}</td>
                <td>${u.email}</td>
                <td>${u.firstName}</td>
                <td>${u.lastName}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>