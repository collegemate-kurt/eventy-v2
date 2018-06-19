<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign Up</title>
</head>
<body>
<div align="center">
    <h1>Create Event</h1>
    <form:form action="/event" method="put" modelAttribute="event">
        <table>
            <tr>
                <td>Title:</td>
                <td><form:input path="title"/></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><form:input path="category"/></td>
            </tr>
            <tr>
                <td>Member Count</td>
                <td><form:input path="memberCount"/></td>
            </tr>
            <tr>
                <td>Location</td>
                <td><form:input path="locationText"/></td>
            </tr>
            <tr>
                <td>Day</td>
                <td><form:input path="day"/></td>
            </tr>
            <tr>
                <td>Start Time</td>
                <td><form:input path="startTime"/></td>
            </tr>
            <tr>
                <td>End Time</td>
                <td><form:input path="endTime"/></td>
            </tr>
            <tr>
                <td>Photo</td>
                <td><form:input path="photoUrl"/></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><form:input path="description"/></td>
            </tr>
            <tr>
                <td>Requirement</td>
                <td><form:input path="requirement"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Update"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>