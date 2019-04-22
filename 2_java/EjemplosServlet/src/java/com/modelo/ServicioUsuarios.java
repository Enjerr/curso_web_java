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
    private final ArrayList<Usuario> listaUsuarios;
    
    public ServicioUsuarios(){
        listaUsuarios = new ArrayList<>();
    }
    public boolean addUsuario (String nom, String password, int edad, String email) {
        
        Usuario nuevoUsu = new Usuario(nom, password, edad, email);
        this.listaUsuarios.add(nuevoUsu);
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
