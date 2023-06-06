<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
        ArrayList<String> agins = new ArrayList<>();
        
        String asignatura1 = request.getParameter("asign1");
        String asignatura2 = request.getParameter("asign2");
        String asignatura3 = request.getParameter("asign3");
        String asignatura4 = request.getParameter("asign4");
        String asignatura5 = request.getParameter("asign5");
        
        agins.add(asignatura1);
        agins.add(asignatura2);
        agins.add(asignatura3);
        agins.add(asignatura4);
        agins.add(asignatura5);
        
        out.println("<h1>Asignaturas Guardadas:</h1>");
        for (String asignatura : agins) {
            out.println("<p>" + asignatura + "</p>");
        }
    %>
</body>
</html>