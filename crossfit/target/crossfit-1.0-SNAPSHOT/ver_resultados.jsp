<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ver precio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css" type="text/css">
</head>
<body>
    <header class="p-3 bg-dark text-white">
    <div class="container">
      <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
          <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
        </a>
      </div>
    </div>
    </header>
<h2>Hito individual de programación del tercer trimestre</h2>
<h2>Mario Alajarín Escobar 1º DAM</h2>
<div class="contenidoraizforms">
    
    <h4>Nombre: <%= request.getParameter("nombre")%></h4>
    <h4>Plan de entrenamiento: <%= request.getAttribute("plan_entrenamiento")%></h4>
    <h4>Precio por plan de entrenamiento: <%= request.getAttribute("precio_plan_entrenamiento")%>£</h4>
    <h4>Precio de las clases privadas: <%= request.getAttribute("clases_privadas")%>£</h4>
    <h4>Categoría en cuanto al peso: <%= request.getAttribute("competir_si_no")%></h4>
    <h4>Precio de las competiciones: <%= request.getAttribute("precio_competiciones")%>£</h4>
    <h4>Cuota total semanal: <%= request.getAttribute("total_clases_semanal_decimales")%>£</h4>
    
    
    
</div>
</body>
</html>