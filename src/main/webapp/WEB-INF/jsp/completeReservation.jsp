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
    <title>Užbaigti registraciją</title>
</head>
<body>
<h2>Užbaigti registraciją</h2>

Aviakompanija ${flight.operatingAirlines}<br/>

išvykimo miestas ${flight.departureCity}<br/>

Atvykimo miestas ${flight.arrivalCity}<br/>

<form action="completeReservation" method="post"/>
<h2>Išsami informacija apie keleivį:</h2>
<pre>
Vardas:<input type="text" name="passengerFirstName"/>
Pavardė:<input type="text" name="passengerLastName"/>
El. Paštas:<input type="text" name="passengerEmail"/>
Telefonas:<input type="text" name="passengerPhone"/>

<h2>Kortelės informacija:</h2>
Name On The Card: <input type="text" name="nameOnTheCard"/>
Card No: <input type="text" name="cardNumber"/>
Expiration Date: <input type="text" name="expirationDate"/>
Three Digits: <input type="text" name="securityCode"/>

<input type="hidden" name="flightId" value="${flight.id}"/>
<input type="submit" value="patvirtinti"/>
</pre>
</form>

</body>
</html>
