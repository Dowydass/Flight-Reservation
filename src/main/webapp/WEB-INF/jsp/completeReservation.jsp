<%--
  Created by IntelliJ IDEA.
  User: DovydasIT
  Date: 5/26/2021
  Time: 9:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Complete Registration</title>
</head>
<body>
<h2>Complete reservation</h2>

Airline ${flight.operatingAirlines}<br/>
Departure City ${flight.departureCity}<br/>
Arrival City ${flight.arrivalCity}<br/>

<form action="completeReservation" method="post"/>
<h2>Passenger Details:</h2>
<pre>
First Name:<input type="text" name="passengerFirstName"/>
Last Name:<input type="text" name="passengerLastName"/>
Email:<input type="text" name="passengerEmail"/>
Phone:<input type="text" name="passengerPhone"/>

<h2>Card Details:</h2>
Name On The Card: <input type="text" name="nameOnTheCard"/>
Card No: <input type="text" name="cardNumber"/>
Expiration Date: <input type="text" name="expirationDate"/>
Three Digits: <input type="text" name="securityCode"/>

<input type="hidden" name="flightId" value="${flight.id}"/>
<input type="submit" value="confirm"/>
</pre>
</form>

</body>
</html>
