<%--
  Created by IntelliJ IDEA.
  User: den
  Date: 30.05.19
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

<div align="center">
    <form action="/login" method="post">
        <h2 align="center">LOGIN</h2>
        <table align="center">
            <tr>
                <td>Name</td>
                <td><input type="text" name="login" placeholder="User name"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" placeholder="Password"> </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="login" value="Login">
                </td>
                <td>
                    <a href="registrations">Registration</a>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>