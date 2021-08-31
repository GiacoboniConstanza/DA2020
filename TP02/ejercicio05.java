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
public class ejercicio05 {
    public static void main(String[] args) {
        int i, numero;
        int [] arreglo = new int [10];
        System.out.println("Ingrese un numero");
        numero = TecladoIn.readLineInt();
        for (i=0;i<arreglo.length;i++){
            if ((i%2) == 0){
                arreglo[i]=numero;
            }
            System.out.print(arreglo[i]+ " ");
        }
    }
    
}
