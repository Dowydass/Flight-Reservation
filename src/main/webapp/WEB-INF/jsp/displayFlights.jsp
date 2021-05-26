<%--
  Created by IntelliJ IDEA.
  User: DovydasIT
  Date: 5/26/2021
  Time: 1:39 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flight list</title>
</head>
<body>
<h2>Flights:</h2>
<table>
    <tr><th>Airlines</th>
        <th>Departure City</th>
        <th>Arrival City</th>
        <th>Departure Time</th></tr>

<c:forEach items="${flights}" var = "flight">
<tr>
    <td>${flight.operatingAirlines}</td>
    <td>${flight.departureCity}</td>
    <td>${flight.arrivalCity}</td>
    <td>${flight.estimatedDepartureTime}</td>
    <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a> </td>
</tr>


</c:forEach>
</table>
</body>
</html>
