/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP02;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio03 {

    public static void main(String[] args) {
        String cadena;
        int i, opcion;
        char c;
        char[] cadenaCaracter = new char[10];
        System.out.println("Ingrese una cadena");
        cadena = TecladoIn.readLine();
        if (cadena.length() == 10) {
            for (i = 0; i < cadenaCaracter.length; i++) {
                c = cadena.charAt(i);
                cadenaCaracter[i] = c;
            }
        } else {
            System.out.println("Error en longitud de la cadena");
        }
        System.out.println("Ingrese 1 para ver la cadena, ingrese 2 para verla invertida");
        opcion = TecladoIn.readLineInt();
        switch (opcion) {
            case 1:
                mostrarCadena(cadenaCaracter);
                break;
            case 2:
                mostrarCadenaInvertida(cadenaCaracter);
                break;
            default:
                System.out.println("Error al ingresar opcion");
        }
    }

    private static void mostrarCadena(char[] cadenaCaracter) {
        int i;
        for (i = 0; i < cadenaCaracter.length; i++) {
            System.out.print(cadenaCaracter[i] + " ");
        }
    }

    private static void mostrarCadenaInvertida(char[] cadenaCaracter) {
        int i;
        for (i=cadenaCaracter.length-1; i >= 0; i--) {
            System.out.print(cadenaCaracter[i] + " ");
        }
    }

}
