<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html>  
<html>  

<body>  

<p> Tu regalo se ha realizado con exito! Por favor, revisa los detalles</p>  
	Nombre: ${regalo.nombre} <br>  
	Descripcion: ${regalo.descripcion} <br>  
	Precio: ${regalo.precio}<br>  
	Tipo de Regalo:	
	<ul>  
	<c:forEach var="regalo" items="${regalo.categoria}"> 
	 
	<li>${regalo}</li>  
	</c:forEach>  
	
	</ul>  

</body>  
</html> 