<%@ page import="model.TODO" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: den
  Date: 29.05.19
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TODO</title>
</head>
<body>
<div>
    <h2 >Your TODO list</h2>
    <table border="2" bgcolor="#f0f8ff">
        <tr bgcolor="aqua">
            <td>
                №
            </td>
            <td>
                Plan description (comment)
            </td>
            <td>
                Done
            </td>
        </tr>

        <%
            List<TODO> todoList = (List<TODO>) request.getAttribute("todoList");
            for (TODO todoItem : todoList) {
        %>

        <tr>
            <td>
                <%=todoItem.getId()%>
            </td>
            <td>
                <%=todoItem.getComment()%>
            </td>
            <td>
                <%=todoItem.isDone()%>
            </td>
        </tr>

        <%
            }
        %>

    </table>
</div>


</body>
</html>