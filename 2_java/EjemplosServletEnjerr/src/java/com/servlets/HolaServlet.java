/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Default
 */
public class HolaServlet extends HttpServlet {
    //para que un servlet sea tal necesita heredar de esa clase.

    //recibir método HTTP
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {

        respuesta.setContentType("text/html;charset=UTF-8");

        try (PrintWriter salida = respuesta.getWriter()) {
            
            salida.println("<html>");
            salida.println("<head>");
            salida.println("<title>Pagina principal Aplicacion</title>");
            salida.println("</head>");
            salida.println("<body>");
            salida.println("<h1>Pagina principal Aplicacion Servlet</h1>");
            salida.println("<h2> Ruta del servlet: " + peticion.getContextPath() + "</h2>");
            salida.println("<h2> M&eacute;todo de la petición: " + peticion.getMethod() + "</h2>");
            salida.println("<ul>");
            
            for(int i = 0; i < 10; i++){
                salida.println("<li> N&uacute;mero " + i + "</li>");
            }
            salida.println("");
            salida.println("");
            salida.println("");
            salida.println("</body>");
            salida.println("</html>");
            

        }
    }

}
