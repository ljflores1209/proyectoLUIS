<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="assets/css/calculadora.css">


<title>Calculadora</title>
</head>
<body>

	<div Class="container-fluid ">
		<div class="row ">

			<div class=" text-center col">
				<h1 class="color">Calculadora</h1>
			</div>


		</div>
		<div class="row">
			<!-- <div class="col-3">hola</div> -->
			<div class="card ancho mx-auto mt-5 p-4">


				<div class="row">
					<!-- input -->
					<div class="col text-center">

						<p id="numero" class="display">0</p>


					</div>
					<div class="row mt-3">
						<div class="col">
							<input type="button"
								class="btn btn-block btn-lg btn-outline-info shadow" value="+"
								id="suma" onclick="show('+')">
						</div>
						<div class="col">
							<input type="button"
								class="btn btn-block btn-lg btn-outline-info shadow" value="-"
								id="resta" onclick="show('-')">
						</div>
						<div class="col">
							<input type="button"
								class="btn btn-block btn-lg btn-outline-info shadow" value="*"
								id="multiplicacion" onclick="show('*')">
						</div>
						<div class="col">
							<input type="button"
								class="btn btn-block btn-lg btn-outline-info shadow" value="/"
								id="division" onclick="show('/')">
						</div>
					</div>
					<div class="row mt-3 ">
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="1" id="1" onclick="show('1')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="2" id="2" onclick="show('2')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="3" id="3" onclick="show('3')">
						</div>
						<div class=col>
							<input type="button"
								class="btn btn-block btn-lg btn-danger shadow" value="c"
								id="clear" onclick="forclear()">
						</div>
					</div>
					<div class="row mt-3">
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="4" id="4" onclick="show('4')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="5" id="5" onclick="show('5')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="6" id="6" onclick="show('6')">
						</div>
						<div class=col>
							<input type="button"
								class="btn btn-block btn-outline-dark btn-lg  shadow" value="."
								id="." onclick="show('.')">
						</div>
					</div>
					<div class="row mt-3">
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="7" id="7" onclick="show('7')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="8" id="8" onclick="show('8')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="9" id="9" onclick="show('9')">
						</div>
						<div class=col>
							<input type="button" class="btn btn-block btn-lg btn-dark shadow"
								value="0" id="0" onclick="show('0')">
						</div>
					</div>
					<div class="col mt-3">
						<input type="button"
							class="btn btn-outline-success form-control mt-3 shadow"
							value="=" id="resultat" onclick="calcular()">
					</div>



				</div>
			</div>
			<!-- <div class="col-3">hola</div> -->
		</div>
		<div class=" text-center col">
			<a href="/proyectoLUIS" class="btn btn-dark mt-3 icon" role="button">Volver</a>
		</div>
	</div>
	<script src="assets/js/calculadora.js"></script>
</body>
</html>