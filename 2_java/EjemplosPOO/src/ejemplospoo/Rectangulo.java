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
public class Rectangulo extends Figura {

    public void AreaRectangulo() {
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("dame base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("dame altura"));
        area = base * altura;
    }
    
    public void PerimetroRectangulo() {
        int base, altura;
        base = Integer.parseInt(JOptionPane.showInputDialog("dame base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("dame altura"));
        perimetro = (2* base) * (2*altura);
    }

    public void setArea(double v_area) {

        area = v_area;

    }

    public void setPerimetro(double v_perimetro) {
        perimetro = v_perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
