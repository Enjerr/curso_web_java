/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Default
 */
public class EjemplosPOO extends Figura {
        private static int opcion;
        private static float dato1,dato2,dato3,dato4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       
       opcion = teclado.nextInt(); 
        switch (opcion) {
            case 1:
                System.out.println("Inserta la base ");
                dato1= (float) teclado.nextDouble();
                break;
            case 2:
                System.out.println("rectangulo");
                dato2 = (float) teclado.nextDouble();
                break;
            case 3:
                System.out.println("cuadrado");
                dato3= (float) teclado.nextDouble();
                break;
            case 4:
                System.out.println("Circulo");
                dato4= (float) teclado.nextDouble();
                break;
            default:
                System.out.println("No has introducido ni A,B,C,D");
        }
    }
    
}
