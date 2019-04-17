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
public class Circulo extends Figura {

    int radio;

    public void AreaCirculo() {
        area = (3.1416 * radio * radio);
        radio = (int) Double.parseDouble(JOptionPane.showInputDialog("dame radio"));

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
