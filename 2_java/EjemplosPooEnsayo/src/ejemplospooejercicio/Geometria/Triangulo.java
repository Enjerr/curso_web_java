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
public class Triangulo extends FigurasConLados {

    private float[] lados;

    public Triangulo(float altura, float base, float[] lados) {
        super(altura, base);
        this.lados = lados;
    }

    public Triangulo(float altura, float base, String color, float[] lados) {
        super(color, altura, base);
        this.lados = lados;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }

    public float calcArea() {
        return (this.base * this.altura) / 2;
    }

    public float calcPerimetro() {
        return lados[0] + lados[1] + lados[2];
    }

}
