/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global arrayLis */

//document.write("<h1>Titulo</h1>");
//document.write("<input type='buton' id = 'boton' value = 'nada';
var h1 = document.createElement("h1");
var texto = document.createTextNode("Titulo DOM");
var body = document.getElementsByTagName("body")[0];
body.appendChild(h1);
h1.appendChild(texto);

jQuery("body").append("<h1>titulo jquery</h1>");
//jQuery("body", {html}:"<h1>TItulo JQury</h1> });
document.getElementById("marco").innerHTML
        ="Otro texto desde JS";
$("#marco").html(
        $("#marco").html()
        + "</br> Otro texto desde JQuery");

//var arrayyLis = document.getElementsByClassName("unaClase");
//for (var i = 0; i < arrayLis.length;i++){
 //  arrayLis[ i ].innerHTML += "-" + i + "!!";
//}

//con Jquery
// $(".miClase").html("Cambiar valor");
 
 //función recorrer lista
var i=0;
    $(".botonRecorrer").click(function () {
        $(".unaClase").each(function () {
            $(this).text('modificación: ' + i);
           // $(".unaClase").append( "<li - </li> ");
            i = i +1;
        });
        
});
 //función reiniciar lista

    $(".botonReinicio").click(function () {
        $(".unaClase").each(function () {
            i = 0;
        $(this).text('modificación: ' + i);
        });
        //i=0;
});