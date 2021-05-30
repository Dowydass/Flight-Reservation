<%--
  Created by IntelliJ IDEA.
  User: DovydasIT
  Date: 5/10/2021
  Time: 1:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prisijungti</title>
</head>
<body>
<div>
    <form action="login" method="post">
        <div>
        <pre>

            Elektroninis paštas: <input type="text" name="email"/>
            Slaptažodis:         <input type="password" name="password"/>
            <input type="submit" value="Prisijungti"/>
            ${msg}

        </pre>
        </div>
    </form>
</div>
<footer>
</footer>

</body>
</html>
