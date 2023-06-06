<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border: 1px black solid">
<thead>
<tr>
<th>ID</th>
<th>Nombre</th>
<th>Correo</th>
<th>Contraseña</th>
</tr>
</thead>
<tbody>
<%

ResultSet rs = (ResultSet) request.getAttribute("resultSet");


while (rs.next()) {
%>
<tr>
<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("nombre") %></td>
<td><%= rs.getString("correo") %></td>
<td><%= rs.getString("password") %></td>
</tr>
<%
}
%>
</tbody>
</table>
</body>
</html>