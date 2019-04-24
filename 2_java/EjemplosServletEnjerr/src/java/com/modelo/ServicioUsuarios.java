/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;

/**
 * 2º
 * 
 *
 * @author Default
 */
public class ServicioUsuarios {
    
    //3º Implementando Singleton
    private DerbyDBUsuario bdUsu;
    private static ServicioUsuarios instancia = null;
    //Nadie puede hacer new salvo esta misma clase
    private ServicioUsuarios(){
        //listaUsuarios = new ArrayList<>();
        bdUsu = new DerbyDBUsuario();
        this.listaUsuarios = bdUsu.listar();
    }
    public static ServicioUsuarios getInstancia(){
        if (instancia == null){
            instancia = new ServicioUsuarios();
            
        }
        return instancia;
    }
    //codigo de la clase
    private final ArrayList<Usuario> listaUsuarios;
    
    
    public boolean addUsuario (String nom, String password, int edad, String email) {
        
        Usuario nuevoUsu = new Usuario(nom, password, edad, email);
        this.listaUsuarios.add(nuevoUsu);
        bdUsu = new DerbyDBUsuario();
        bdUsu.crear(nuevoUsu);
        return true;
    }
    public boolean validacionpasswd(String email, String passwd){
        for(Usuario usu : listaUsuarios){
            if(usu.getEmail().equals(email) && usu.getPassword().equals(passwd)){
                return true;
            }
        }
        return false;
    }
    
    public int cantidadUsuarios(){
        return listaUsuarios.size();
    }
    
}
