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
public class ejercicio06 {

    public static void main(String[] args) {

        int i, mayor = 0, menor = 999, num, posMayor = 0, posMenor = 0;
        int[] arreglo = new int[5];
        for (i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero");
            num = TecladoIn.readLineInt();
            arreglo[i] = num;
            if (num < menor) {
                menor = num;
                posMenor = i;
            }
            if (num > mayor) {
                mayor = num;
                posMayor = i;
            }
        }
        System.out.println("El numero mayor del arreglo es " + mayor + " en posicion " + posMayor);
        System.out.println("El numero menor del arreglo es " + menor + " en posicion " + posMenor);

    }

}
