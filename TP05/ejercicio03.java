/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP05;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio03 {

    public static void main(String[] args) {
        String cadena;
        System.out.println("Ingrese una cadena");
        cadena = TecladoIn.readLine();
        capicua(cadena);
    }

    public static void capicua(String cadena) {
        int inc = 0;
        int des = cadena.length() - 1;
        boolean bError = false;
        while ((inc < des) && (!bError)) {

            if (cadena.charAt(inc) == cadena.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
        if (!bError) {
            System.out.println(cadena + " es un PALINDROMO");
        } else {
            System.out.println(cadena + " NO es un palindromo");
        }
    }

}
