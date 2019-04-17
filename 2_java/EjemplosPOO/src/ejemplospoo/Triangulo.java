/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Default
 */
public class Triangulo extends Figura {
     //atribustos
    private int color;
    
    public void setcolor(int color){
        this.color = color;
    }
    

 
    double base ,altura,area;
    public void AreaTriangulo(){
        base=Double.parseDouble(JOptionPane.showInputDialog("dame base"));
        altura=Integer.parseInt(JOptionPane.showInputDialog("dame altura"));
        area=(base*altura)/2;
 
    }
    public void setArea(double v_area){
 
    area=v_area;
 
}
 
public void setPerimetro(double v_perimetro){
    perimetro=v_perimetro;
}
public double  getArea(){
    return area;
}
public double getPerimetro(){
    return perimetro;
}
}
