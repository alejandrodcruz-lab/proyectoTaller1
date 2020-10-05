<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Este es el home de la página</h1>
	

	<!-- cuando se da al botón submit del formulario lleva a la acción "/irACategoria" -->
	<form:form action="irACategoria" method="GET"
		modelAttribute="categoria">
		<h3>Categorias</h3>

		<br>
				

		<form:input path="checkbox1" type="text" name="restaurante" value="Restaurante"/>
		<form:input path="checkbox2" type="text" name="spa" value="Spa"/>
		<form:input path="checkbox3" type="text" name="actividades" value="Actividades"/>

		<button class="btn btn-lg btn-primary btn-block" Type="Submit" />Seleccionar</button>
	</form:form>




	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>