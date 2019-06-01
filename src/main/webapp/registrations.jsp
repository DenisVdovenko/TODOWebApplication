<%--
  Created by IntelliJ IDEA.
  User: den
  Date: 31.05.19
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<div align="center">
    <form action="/registration" method="post">
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
                    <a href="login">Login</a>
                </td>
                <td>
                    <input type="submit" name="registration" value="Registration">
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>