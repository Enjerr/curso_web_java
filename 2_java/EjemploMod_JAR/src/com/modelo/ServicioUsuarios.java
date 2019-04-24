/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;

/**
 *
 * @author Formacion
 */
public class ServicioUsuarios {

    private DerbyDBUsuario bdUsu;

    //Implementano singleton
    private static ServicioUsuarios instancia = null;

    private ServicioUsuarios() { //Nadie puede hacer new salvo esta misma clase
        //listaUsuarios = new ArrayList<>();
        bdUsu = new DerbyDBUsuario();
        this.listaUsuarios = bdUsu.listar();
    }

    public static ServicioUsuarios getInstancia() { //Unica manera de objtener un objeto de esta clase
        if (instancia == null) {
            instancia = new ServicioUsuarios();
        }

        return instancia;
    }

    //Codigo de la clase
    private ArrayList<Usuario> listaUsuarios;

    public boolean addUsuario(String nom, String edad, String email, String password) {
        try {
            if (nom.equals("") || edad.equals("") || email.equals("") || password.equals("")) {

                return false;
                
            } else {
                int IEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(null, nom, IEdad, email, password);
                //this.listaUsuarios.add(nuevoUsu);
                bdUsu = new DerbyDBUsuario();
                boolean creado= bdUsu.anadir(nuevoUsu);
                listaUsuarios = bdUsu.listar();
                
                return listaUsuarios != null && creado;
                
            }

            } catch (Exception ex){
            System.err.println(">>>>>>>ERROR: no se ha podido crear usuario" + ex.getMessage());
                    return false;
        }
     }


    public boolean validacionPasswd(String email, String passwd) {
        for (Usuario usu : listaUsuarios) {
            if (usu.getEmail().equals(email) && usu.getPassword().equals(passwd)) {
                return true;
            }
        }
        return false;
    }
    
    public Usuario obtenerUno(String email){
        return this.bdUsu.ObtenerUno(email);
    }
 public boolean modificarUsuario(String id, String nom, String password, String edad, String email) {
        try {
            if (id.equals("")||nom.equals("") || edad.equals("") || email.equals("") || password.equals("")) {

                return false;
                
            } else {
                int IEdad = Integer.parseInt(edad);
                int IId = Integer.parseInt(id);
                Usuario nuevoUsu = new Usuario(IId ,nom, IEdad, email, password);
                //this.listaUsuarios.add(nuevoUsu);
                bdUsu = new DerbyDBUsuario();
                boolean modificado= bdUsu.cambiarDatosDB(nuevoUsu);
                listaUsuarios = bdUsu.listar();
                
                return listaUsuarios != null && modificado;
                
            }

            } catch (Exception ex){
            System.err.println(">>>>>>>ERROR: no se ha podido modificar usuario" + ex.getMessage());
                    return false;
        }
     }
    public boolean cambiarDatos(Usuario usu) {
        int pos = 0;
        if (bdUsu.cambiarDatosDB(usu)) {

            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getEmail().equals(usu.getEmail())) {
                    pos = i;
                    break;
                }
            }
            listaUsuarios.set(pos, usu);
            //listaUsuarios.clear();
            //this.listaUsuarios = bdUsu.listar();
            return true;
        } else {
            return false;
        }
    }
    public boolean eliminar(String id){
        try {
            if (id.equals("")) {

                return false;
                
            } else {
                Integer IId = Integer.parseInt(id);
                //this.listaUsuarios.add(nuevoUsu);
                bdUsu = new DerbyDBUsuario();
                boolean eliminado= bdUsu.eliminar(IId);
                listaUsuarios = bdUsu.listar();
                
                return listaUsuarios != null && eliminado;
                
            }

            } catch (Exception ex){
            System.err.println(">>>>>>>ERROR: no se ha podido eliminar usuario" + ex.getMessage());
                    return false;
        }
    }

    public int cantidadUsuarios() {
        return listaUsuarios.size();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /*public boolean eliminarUsuarios(Usuario usu) {

        return bdUsu.eliminar(usu);

    }*/

    public ArrayList<Usuario> listar() {
        return this.listaUsuarios;
    }
}
