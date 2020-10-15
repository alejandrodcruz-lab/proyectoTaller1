<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>  
<html>  
<head>  
    <title>Regalo Comprado</title> 
    <!-- Bootstrap core CSS -->
	    <link href="../css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
 
</head> 
<header>
<%@ include file="./layout/Header.jsp"%> 
</header> 

<body>  
<div class="alert alert-info container" role="alert">

<div style="margin-top:30px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
<h3> Tu regalo se ha realizado con exito! Por favor, revisa los detalles</h3>  
 <h3>	Nombre: ${regalo.nombre} <br>  
	Descripci�n: ${regalo.descripcion} <br>  
	Precio: ${regalo.precio}<br>  
	Tipo de regalo:	
	<ul>  
	<c:forEach var="regalo" items="${regalo.categoria}"> 
	 
	<li>${regalo}</li>  
	</c:forEach>  </h3>
	
	</ul>  
	</div>
	</div>
	

</body>  
</html> 