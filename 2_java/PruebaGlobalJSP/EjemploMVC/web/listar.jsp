<%-- 
    Document   : listar
    Created on : 23-abr-2019, 15:47:49
    Author     : Default
--%>
<%@include file="head.jsp" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();

%>

<html>
    <%= head()%>
    <body>
        <%@include file="header.jsp" %>


        <table>
            <thead>

            <th>Nombre</th>
            <th>Email</th>

        </thead>
        <tbody>
            <%
                for (Usuario usu : listaUsu) {
            %>
            <tr>
                <td><% out.print(usu.getNombre()); %></td>
                <td><% out.print(usu.getEmail()); %></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>


</body>
</html>
