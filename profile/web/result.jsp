<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 08.04.2020
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "logic.Pelper" %>
<%@ page import="logic.Pelper" %>
<%Pelper pelper = new Pelper(); %>
<html>
<head>
    <title>Result</title>
    <style>
        body { background: aqua; }
    </style>
</head>
<body>
<table border="1">
    <caption><h1>Table with your answers</h1></caption>
    <tr>
        <th>First name</th>
        <th>Last Name</th>
        <th>I'm over 18</th>
        <th>I'm under 18</th>
        <th>I learn Java</th>
        <th>I do not learn Java</th>
    </tr>
    <tr>
        <td><center><%= pelper.feedback("firstName", false) %></center></td>
        <td><center><%= pelper.feedback("lastName", false) %></center></td>
        <td><center><%= pelper.feedback("ageYes", false) %></center></td>
        <td><center><%= pelper.feedback("ageNo", false) %></center></td>
        <td><center><%= pelper.feedback("learnYes", false) %></center></td>
        <td><center><%= pelper.feedback("learnNo", false) %></center></td>
    </tr>
</table>
<table border="1">
    <caption><h1>Table with statistic</h1></caption>
    <tr>
        <th>First name</th>
        <th>Last Name</th>
        <th>I'm over 18</th>
        <th>I'm under 18</th>
        <th>I learn Java</th>
        <th>I do not learn Java</th>
    </tr>
    <tr>
        <td><center><%= pelper.feedback("firstName", true) %></center></td>
        <td><center><%= pelper.feedback("lastName", true) %></center></td>
        <td><center><%= pelper.feedback("ageYes", true) %></center></td>
        <td><center><%= pelper.feedback("ageNo", true) %></center></td>
        <td><center><%= pelper.feedback("learnYes", true) %></center></td>
        <td><center><%= pelper.feedback("learnNo", true) %></center></td>
    </tr>
</table>
    <form method="POST" action="index.jsp" name="index">
    <center><button name="Run_index.jsp"type="submit" > Try again </button></center>
</form>
</body>
</html>
