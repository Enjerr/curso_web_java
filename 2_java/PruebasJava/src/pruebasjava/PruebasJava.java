/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjava;

//import javax.swing.JOptionPane;
import java.util.Random;
  
/**
 *
 * @author Default
 */
public class PruebasJava {
    
static final float MI_PI =3.1416f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float PI =3.14f;
        int contador = 0;
        while (contador < 10) {
            System.out.println("Contador vale: " + contador);
            // contador = contador +1;
            //contador +=1;
            contador++;
        }
        // String saludo = JOptionPane.showInputDialog("introduce el saludo que deseas transmitir.");
        //JOptionPane.showMessageDialog(null, saludo);
        if (contador < 10) {
            System.out.println("Menor que 10");
        } else if (contador == 10) {
            System.out.println("igual que 10");
        } else if (contador < 20) {
            System.out.println("Menor que 20");
        } else {
            System.out.println("mayor que 20");
        }
        String letra = "B".toLowerCase();
        switch (letra) {
            case "a":
                System.out.println("Letra A");
                break;
            case "b":
                System.out.println("Letra B");
                break;
            case "c":
                System.out.println("Letra C");
                break;
            case "d":
                System.out.println("letra D");
                break;
            default:
                System.out.println("No has introducido ni A,B,C,D");
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(">>" + valorAleatorio());
        }
        System.out.println("Iva 10: " + calcularIVA(10, 21));
        System.out.println("Iva 10: " + calcularIVA(20, 21));
        System.out.println("Iva 10: " + calcularIVA(30, 21));
         System.out.println("PI= " + PI);
        System.out.println("MI_PI= " + MI_PI);
    }

    static void losMismosEjemplos() { //no devuelve nada
        for (int i = 5; i > 0; i--) {
            System.out.println("El cuadrado de" + i + "es: " + i * i);
        }
    }

    static float calcularIVA(float precio, float iva) {
        float resultado = precio + iva / 100 * precio;
        return resultado;
    }

    static float valorAleatorio() {
        Random r = new Random();
        return r.nextFloat();
    }

}
