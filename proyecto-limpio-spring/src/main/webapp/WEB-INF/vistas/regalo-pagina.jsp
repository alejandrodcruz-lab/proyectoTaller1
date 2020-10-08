<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<!DOCTYPE html>  
<html>  
<head>  
    <title>Regalo Form</title>  
</head>  
<h3>Completa los datos para realizar tu regalo</h3>  

<body>  
    <form:form action="submitForm" modelAttribute="regalo">  
        Nombre: <form:input path="nombre" />      
        <br><br>  
        Numero de Caja: <form:input path="numeroDeCaja" />  
        <br><br>  
        Descripcion: <form:input path="descripcion"/>  
        <br><br>  
        Precio que deseas gastar: <form:input path="precio"/>
        <br><br>
        Escoge tu regalo:
        <br><br>
        Restaurante <form:checkbox path="categoria" value="Restaurante"/>  
        Spa <form:checkbox path="categoria" value="Spa"/>  
        Cursos <form:checkbox path="categoria" value="Cursos"/>  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  