<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- 	CDM BOOTSTRAP   -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- 	CDM BOOTSTRAP   -->

</head>
<body>

<div class="container">
        <div class="jumbotron">
            <h1>Nuevo producto</h1>
            <p>Introduzca los datos del producto</p>
        </div>
 
        <form action="./LuisController?accion=insertar" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label> <input type="text"
                    class="form-control" placeholder="Introduzca el nombre" name="nombre">
            </div>
             <div class="form-group">
                <label for="nombre">Tipo:</label> <input type="text"
                    class="form-control" placeholder="Introduzca el tipo" name="tipo">
            </div>
            <div class="form-group">
                <label for="nombre">Precio:</label> <input type="text"
                    class="form-control" placeholder="Introduzca el precio" name="precio">
            </div>
            <div class="form-group">
                <label for="nombre">Fecha:</label> <input type="date"
                    class="form-control" placeholder="Introduzca la fecha" name="fecha">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <div class="text-danger">
			<c:out value="${mensaje}" />
		</div>
 
    </div>

</body>
</html>