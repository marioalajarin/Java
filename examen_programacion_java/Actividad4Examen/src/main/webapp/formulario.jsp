<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Controller">
<select name="asignaturas">
	<option value="programacion">Programación</option>
	<option value="bases_de_datos">Bases de datos</option>
	<option value="lenguaje_de_marcas">Lenguaje de marcas</option>
	<option value="entornos_de_desarrollo">Entornos de desarrollo</option>
	<option value="sistemas_operativos">Sistemas operativos</option>
</select>
<input type="submit" value="Guardado persistente">
</form>

<hr>
<form method="post" action="guardar_asignaturas.jsp">
<p>Un campo para cada asignatura</p>
    <label for="nombre">Asignatura 1:</label>
    <input type="text" id=asign1 name="asign1">
    <label for="unidades">Asignatura 2:</label>
	<input type="text" id=asign2 name="asign2">
    <label for="precio">Asignatura 3:</label>
 	<input type="text" id=asign3 name="asign3">
    <label for="precio">Asignatura 4:</label>
 	<input type="text" id=asign4 name="asign4">
    <label for="precio">Asignatura 5:</label>
    <input type="text" id=asign5 name="asign5">
<input type="submit" value="Guardado no persistente">
</form>
</body>
</html>