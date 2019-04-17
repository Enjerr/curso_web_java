/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

/**
 *
 * @author Default
 */
public class Cuadrado extends Rectangulo {
         //atribustos
    private int color;
    
    public void setcolor(int color){
        this.color = color;
    }
    
    public int getcolor(){
        
        return color;
    }
   
  // Calculos para hayar el rectangulo  
    private float calcularArea (float lado){
        float area = lado * 2;
        return area;
    }
    private float calcularPerimetro (float lado){
        float area = lado * 4;
        return area;
    }
}
