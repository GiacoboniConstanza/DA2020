/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

/**
 *
 * @author Coqui
 */
public class cuestionario {
    public static int misterio2(String cad, char x) {

        // ...ejemplo de un recorrido total

        int i, cont;

        cont = 0;

        for (i = 0; i < cad.length(); i++) {

            if (cad.charAt(i) == x )

                cont++;

        }

return cont;

    }
    public static void main(String[] args) {

        // TODO code application logic here

        String cadena;

        int resultado;

        cadena = "entusiasmo";

        resultado = misterio2(cadena,'a')+ misterio2(cadena,'e') +misterio2(cadena,'i') +misterio2(cadena,'o') +misterio2(cadena,'u');
        System.out.println(resultado);
}
    
    
}
