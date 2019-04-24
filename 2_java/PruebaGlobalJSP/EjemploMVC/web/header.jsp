<%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<h1>Página principal Aplicacion serlests</h1>
</head>
    <nav>
        <a href  ="index.jsp">Inicio </a>
    <c:catch var = "exception">
        <jsp:useBean id = "usuario" type = "com.modelo.Usuario" scope="session">
                   <jsp:getProperty property = "*" name="usuario"/>
                   <jsp:getProperty property = "id" name="usuario"/>
                   <jsp:getProperty property = "email" name="usuario"/>
            
        </jsp:useBean>
        <a href="listar.jsp">listado</a>
        <a href="eliminar.jsp">Eliminar</a>
    </c:catch>
        <c:if test="${not empty exception}">

        <a href="login.jsp"> login</a>
        <a href="registro.jsp"> registro</a>
        </c:if>
    </nav>

