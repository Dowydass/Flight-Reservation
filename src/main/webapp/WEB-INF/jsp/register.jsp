<%--
  Created by IntelliJ IDEA.
  User: Dovyd
  Date: 5/9/2021
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="registerUser" method="post">
    <pre>
        <h2>Registration</h2>
    First Name:       <input type="text" name="name"/>
    Last Name:        <input type="text" name="surname"/>
    Email:            <input type="text" name="email"/>
    Password:         <input type="password" name="password"/>
    Confirm Password: <input type="password" name="confirmPassword"/>
    <input type="submit" value="register"/>
    </pre>
</form>
</body>
</html>
