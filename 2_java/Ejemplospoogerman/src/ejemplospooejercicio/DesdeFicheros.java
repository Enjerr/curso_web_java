/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospooejercicio;

import ejemplospooejercicio.Geometria.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Default
 */
public class DesdeFicheros {

    //nmetodo
    public static void guardarRectangulo() {
        //
        Rectangulo rec = new Rectangulo(10, 5);
        FileWriter fichero = null;
        PrintWriter pw = null;

        try { // Intentamos hacer cosas con fichero, si ocurre algun error

            fichero = new FileWriter("c:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.print("Rectangulo: " + " , base= " + rec.getBase()
                    + ", altura= " + rec.getAltura()
                    + ", color= " + rec.getColor());

        } catch (Exception ex) {// catch() captura la excepción
            ex.printStackTrace();
        } finally { // finally ejecuta siempre, con error o sin el.
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

    public static void leerRectangulo() {

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File("c:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            linea = br.readLine();
            if (linea != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void areaRectangulo() {

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux = "";

        try {
            fichero = new File("c:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            // Introducimos la lectura en nuestra variable
            linea = br.readLine();
            // readline devuelve null cuando no encuentra más caracteres entonces:
            if (linea != null) {
                System.out.println(linea);

                String[] cadena = linea.split("= ");

                String[] num = new String[cadena.length];
                ArrayList<String> numero = new ArrayList<>();

                //System.out.println(cadena);
                for (int i = 0; i < cadena.length; i++) {
                    num = cadena[i].split(",");
                    numero.add(String.valueOf(num[0]));

                    //System.out.println("--" + numero[i]);
                }

                for (int i = 0; i < cadena.length; i++) {
                    System.out.println("===>" + numero.get(i));

                    //System.out.println("--" + numero[i]);
                }
                System.out.println("===RECTANGULO====");
                Rectangulo re = new Rectangulo(Float.valueOf(numero.get(2).trim()), Float.valueOf(numero.get(1).trim()), numero.get(3).trim());
                System.out.println("AREA Rectangulo= " + re.calcArea());
                System.out.println("PERIMETRO Rectangulo= " + re.calcPerimetro());
                System.out.println("COLOR Rectangulo= " + re.getColor());
                System.out.println("================");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void componentesRectangulo() {

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux = "";

        try {
            fichero = new File("c:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            // Introducimos la lectura en nuestra variable
            linea = br.readLine();
            // readline devuelve null cuando no encuentra más caracteres entonces:
            if (linea != null) {
                System.out.println("EJERCICIO FINAL");

                System.out.println(linea);
                
                Rectangulo rec = new Rectangulo(0,0);

                String[] cadena = linea.split(",")[1].split(",");
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
