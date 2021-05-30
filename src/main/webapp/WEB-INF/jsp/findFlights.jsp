<%--
  Created by IntelliJ IDEA.
  User: Dovydas
  Date: 5/25/2021
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Skrydžių sąrašas</title>
</head>
<body>
  <h2>Skrydžių sąrašas</h2>
<form action="findFlights" method="post">
    Iš:<input type="text" name="from">
    Į:<input type="text" name="to">
    Išvykimo data:<input type="text" name="departureDate">
    <input type="submit" value="Ieskoti"/>
</form>

</body>
</html>
