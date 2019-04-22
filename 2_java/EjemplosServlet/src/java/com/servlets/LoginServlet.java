/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.modelo.ServicioUsuarios;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Default
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int iEdad = 0;

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Leyendo informacion LoginServlet</title>");
            out.println("<h1>Devolviendo su información: </h1>");
            String email = request.getParameter("email");
            String password = request.getParameter("passwd");
            boolean camposOk = true;
            if (email.equals("")) {
                camposOk = false;
                out.println("<p style='background-color: red'> Rellene el email</p>");
            } 
            
            if (password.equals("")) {
                camposOk = false;
                out.println("<p style='background-color: red'> Introduce la contraseña</p>");
            }
            ServicioUsuarios su = ServicioUsuarios.getInstancia();
            if (camposOk) {
                
                if (su.validacionpasswd(email, password)){
                    out.println( "<p style='background-color: yellow'> Login correcto</p>");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert(\" Login correcto\");");
                    out.println("</script>");
                    
                }else {
                    out.println("<p style='background-color: red'> Login erroneo</p>");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert(\" Login erroneo\");");
                    out.println("</script>");
                    response.sendRedirect("registro.html");
                }
            } 
            
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
