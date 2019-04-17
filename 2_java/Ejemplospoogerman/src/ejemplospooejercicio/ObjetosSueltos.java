/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospooejercicio;

import ejemplospooejercicio.Geometria.Circulo;
import ejemplospooejercicio.Geometria.Cuadrado;
import ejemplospooejercicio.Geometria.Rectangulo;
import ejemplospooejercicio.Geometria.Triangulo;

/**
 *
 * @author Default
 */
public class ObjetosSueltos {

    public static void calculosSueltos() {
        Rectangulo rec = new Rectangulo(10, 5);

        System.out.println("Area Rectangulo: " + rec.calcArea());
        System.out.println("Perimetro Rectangulo: " + rec.calcPerimetro());
        System.out.println("Perimetro Rectangulo: " + rec.getColor());
        System.out.println("====================================== ");

        Cuadrado cu = new Cuadrado(10, 5, "azul");

        System.out.println("Area Cuadrado: " + cu.calcArea());
        System.out.println("Perimetro Cuadrado: " + cu.calcPerimetro());
        System.out.println("Perimetro Cuadrado: " + cu.getColor());
        System.out.println("====================================== ");

        float[] lados = {2, 3, 5};
        Triangulo t1 = new Triangulo(3, 6, "blanco", lados);

        System.out.println("Area Triangulo: " + t1.calcArea());
        System.out.println("Perimetro Triangulo: " + t1.calcPerimetro());
        System.out.println("Perimetro Triangulo: " + t1.getColor());
        System.out.println("====================================== ");

        Circulo ci = new Circulo("blanco", 10);

        System.out.println("Area Circulo: " + ci.calcArea());
        System.out.println("Perimetro Circulo: " + ci.calcPerimetro());
        System.out.println("Perimetro Triangulo: " + ci.getColor());
        System.out.println("===================================== ");

    }

}
