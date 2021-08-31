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
public class ejercicio04 {
    public static void main(String[] args) {
        int i, numero;
        int [] multiplo = new int [10];
        System.out.println("Ingrese un numero entero");
        numero = TecladoIn.readLineInt();
        for (i=0;i<multiplo.length;i++){
           multiplo [i] = (i+1)*numero;
           System.out.print(multiplo [i] + " ");
        }
    }
    
}
