
/* global math */

var pruebasjava={
    
};
const MI_PI =3.1416;
const PI =3.14;
function dameDoble(numero){
    return numero *2;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import javax.swing.JOptionPane;

  
/**
 *
 * @author Default
 */
 class PruebasJava {
    

    /**
     * @param args the command line arguments
     */
    main(args) {
        
        let contador = 0;
        while (contador < 10) {
            console.log("Contador vale: " + contador);
            // contador = contador +1;
            //contador +=1;
            contador++;
        }
        // String saludo = JOptionPane.showInputDialog("introduce el saludo que deseas transmitir.");
        //JOptionPane.showMessageDialog(null, saludo);
        if (contador === 10) {
            console.log("Menor que 10");
        } else if (contador === 10) {
            console.log("igual que 10");
        } else if (contador < 20) {
            console.log("Menor que 20");
        } else {
            console.log("mayor que 20");
        }
        let letra = "B".toLowerCase();
        switch (letra) {
            case "a":
                console.log("Letra A");
                break;
            case "b":
                console.log("Letra B");
                break;
            case "c":
                console.log("Letra C");
                break;
            case "d":
                console.log("letra D");
                break;
            default:
                console.log("No has introducido ni A,B,C,D");
        }

        for (var i = 5; i > 0; i--) {
            console.log(">>" + this.valorAleatorio());
        }
        console.log("Iva 10: " + this.calcularIVA(10, 21));
        console.log("Iva 10: " + this.calcularIVA(20, 21));
        console.log("Iva 10: " + this.calcularIVA(30, 21));
        console.log("PI= " + PI);
        console.log("MI_PI= " + MI_PI);
        console.log("el doble de 7 es: " + dameDoble(7));
        for (i = 5; i > 0; i--) {
            console.log("El cuadrado de" + i + "es: " + i * i);
        }
        this.losMismosEjemplos();
    }

    losMismosEjemplos() { //no devuelve nada
        for (i = 5; i > 0; i--) {
            console.log("El cuadrado de" + i + "es: " + i * i);
        }
    }

     calcularIVA( precio, iva) {
        var resultado = precio + iva / 100 * precio;
        return resultado;
    }

     valorAleatorio() {
        
        return math.Random();
    }

}
var miPrueba = new PruebasJava();
miPrueba.main();

