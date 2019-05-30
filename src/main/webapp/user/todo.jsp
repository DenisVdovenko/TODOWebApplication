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
Your todo list

<%
    List<TODO> todoList = (List<TODO>) request.getAttribute("todoList");
    for (TODO todoItem : todoList) {
%>

<p>
    <%=todoItem.getId()%>
    <%=todoItem.getComment()%>
    <%=todoItem.isDone()%>
</p>

<%
    }
%>


</body>
</html>
