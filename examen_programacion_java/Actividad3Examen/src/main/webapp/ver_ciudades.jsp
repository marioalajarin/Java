<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Ciudades</title>
</head>
<body>
    <h1>Lista de Ciudades</h1>
    <ul>
        <% for (String elemento : (ArrayList<String>) request.getAttribute("lista")) { %>
            <li><%= elemento %></li>
        <% } %>
    </ul>
</body>
</html>