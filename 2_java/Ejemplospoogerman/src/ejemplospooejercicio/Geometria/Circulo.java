/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospooejercicio.Geometria;

/**
 *
 * @author Default
 */
public class Circulo extends Figura {

    private float radio;

    public Circulo(String color, float radio) {
        //llamamos el constructor del padre CON SUPER
        super(color);

        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    public float calcPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
