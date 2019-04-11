/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var i=0;
$(document).ready(function () {
    $(".boton").click(function () {
        $(".unaClase").each(function () {
            $(this).text('modificación: ' + i);
            i += 1;
        });
    });
});