<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CiudadesServlet" method="post">
<input type="text" name="nombre_ciudad" placeholder="inserte nombre de la ciudad" required>
<input type="submit" value="Enviar">
</form>
<hr>
<form action="CiudadesServlet" method="post">
<input type="text" name="nombre_ciudad_borrada" placeholder="inserte nombre de la ciudad que quiera borrar" required>
<input type="submit" value="Enviar">
</form>
</body>
</html>