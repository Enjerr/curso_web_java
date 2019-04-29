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
public class Rectangulo extends FigurasConLados {

    public Rectangulo(float altura, float base) {
        super(altura, base);
    }

    public Rectangulo(float altura, float base, String color) {
        super(color, altura, base);
    }

    /**
     * Calculo del area del rectagulo
     *
     * @retun area new value of area
     */
    public float calcArea() {
        return this.base * this.altura;
    }

    public float calcPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
