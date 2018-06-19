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
    <h4><a href="/event/createEventForm">Create Event</a></h4>

    <table border="1">
        <th>id</th>
        <th>Title</th>
        <th>Category</th>
        <th>MemberCount</th>
        <th>Location</th>
        <th>Start Time</th>
        <th>End Time</th>

        <c:forEach var="event" items="${eventList}">
            <a href="/event/{event.id}">
                <tr>
                    <td>${event.id}</td>
                    <td>${event.title}</td>
                    <td>${event.category}</td>
                    <td>${event.memberCount}</td>
                    <td>${event.locationText}</td>
                    <td>${event.startTime}</td>
                    <td>${event.endTime}</td>

                    <td>
                        <a href="/event/${event.id}/updateEventForm">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/event/${event.id}/delete">Delete</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/event/${event.id}">Detail</a>
                    </td>
                </tr>
            </a>
        </c:forEach>
    </table>

</div>
</body>
</html>