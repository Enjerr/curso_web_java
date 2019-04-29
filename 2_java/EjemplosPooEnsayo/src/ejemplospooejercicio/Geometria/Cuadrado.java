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
public class Cuadrado extends Rectangulo {

    public Cuadrado(float altura, float base) {
        super(altura, base);
    }

    public Cuadrado(float altura, float base, String color) {
        super(altura, base, color);
    }

    /**
     * Calculo del area del rectagulo
     *
     * @retun area new value of area
     */
    public float calcArea() {
        return this.base * this.base;
    }

    public float calcPerimetro() {
        return this.base * 4;
    }
}
