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
public class ejercicio07 {

    public static void main(String[] args) {

        int i, num, largo, contador = 0;
        double promedio;
        System.out.println("Ingrese la cantidad de numeros a registrar");
        largo = TecladoIn.readLineInt();
        int[] arreglo = new int[largo];
        for (i = 0; i < largo; i++) {
            System.out.println("Ingrese un numero");
            num = TecladoIn.readLineInt();
            arreglo[i] = num;
            contador += num;
        }
        promedio = contador / largo;
        for (i = 0; i < largo; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("El promedio es " + promedio);
    }

}
