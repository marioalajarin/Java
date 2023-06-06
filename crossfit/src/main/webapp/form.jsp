<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <script src="script.js"></script>
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
      <h1>Formulario</h1>
      <h3><%=new Date() %></h3>
      <form method="post" action="CalcularServlet">
          <div class="form-group">
              <p>Ingrese su nombre:</p>
              <input type="text" name="nombre" placeholder="nombre" required>
          </div>
          <div class="form-group">
              <p>Selecciones el plan de trabajo:</p>
              <select name="planes-trabajo" id="plan-select">
                <option value="principiante">Principiante | 2 sesiones semanales | £25.00</option>
                <option value="intermedio">Intermedio | 3 sesiones semanales | £30.00</option>
                <option value="elite">Élite | 5 sesiones semanales | £35.00</option>
              </select>
          </div>
          <div class="form-group">
              <p>Ingrese su peso:</p>
              <select name="categoria_peso" id="categoria_peso">
                  <option value="no_competir">Menos de 66Kg | No puede competir</option>
                  <option value="flyweight">Entre 66Kg y menos que 73Kg | Peso pluma</option>
                  <option value="lightweight">Entre 73Kg y menos de 81Kg | Peso ligero</option>
                  <option value="light_middleweight">Entre 81 Kg y menos de 90Kg | Peso medio-ligero</option>
                  <option value="middleweigth">Entre 90Kg y menos de 100Kg | Peso medio</option>
                  <option value="light_heavyweight">Si el peso es igual a 100Kg | Peso pesado-ligero</option>
                  <option value="heavyweight">Si es mayor a 100Kg | Peso pesado</option>
              </select>
          </div>
          <div class="form-group">
              <p>Ingrese las clases privadas deseadas (mínimo 0 máximo 5) £9.50 por sesión:</p>
              <input type="number" name="clases-privadas" placeholder="clases privadas" min="0" max="5" required>
          </div>
          <div class="form-group" id="competiciones-group">
              <p>¿Va a participar este més en alguna competición?:</p>
              <select name="competiciones">
                <option value="seleccione">Seleccione una opción</option>
                <option value="si">Sí</option>
                <option value="no">No</option>
              </select>
          </div>
          <input type="submit" value="Enviar" name="send_data" class="btn btn-primary mb-2">
      </form>

</div>
</body>
</html>
