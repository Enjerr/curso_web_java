/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Default
 */
public class DerbyDBUsuario {

    public DerbyDBUsuario() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        } catch (Exception ex) {
            Logger.getLogger(DerbyDBUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Usuario> listar(){
        try(Connection con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")){
            ArrayList<Usuario> ListaUsu = new ArrayList<>();
            String consultaSQL = "SELECT id, nombre, edad, email, password FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consultaSQL);
            while (res.next()){
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String password = res.getString("password");
                int edad = res.getInt("edad");
                String email = res.getString("email");
                Usuario usu = new Usuario(nombre, password, edad, email);
                ListaUsu.add(usu);
                
            }
            return ListaUsu;
        } catch (SQLException ex) {
           System.err.println(">>>" + ex.getMessage());
           return null;
        }
    }
    public boolean crear(Usuario persona){
        try(Connection con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")){
            String sqlID= "SELECT COUNT(id) AS ultid FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sqlID);
            if(res.next()){
                int ultID = res.getInt("ultID");
                ultID ++;
                String sqlInsert = "INSERT INTO usuario(id, nombre, password, edad, email) VALUES (" 
                        + ultID + ", '" + persona.getNombre() + "' "
                        + ", '"+ persona.getPassword() + "'"
                        + ", " + persona.getEdad() + " , '"
                        + persona.getEmail() + "' )";
                System.err.println(">>>>" + sqlInsert);
                sentencia = con.createStatement();
                sentencia.executeUpdate(sqlInsert);
                return true;
                        
            }
            return false;
        }catch (SQLException ex) {
           System.err.println(">>>" + ex.getMessage());
           return false;
        }
    }
    
       public ArrayList<Usuario> listados(){
        try(Connection con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")){
            ArrayList<Usuario> ListaUsu = new ArrayList<>();
            String consultaSQL = "SELECT id, nombre, edad, email, password FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consultaSQL);
            while (res.next()){
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String password = res.getString("password");
                int edad = res.getInt("edad");
                String email = res.getString("email");
                Usuario usu = new Usuario(nombre, password, edad, email);
                ListaUsu.add(usu);
                
            }
            return ListaUsu;
        } catch (SQLException ex) {
           System.err.println(">>>" + ex.getMessage());
           return null;
        }
    }
    
}
