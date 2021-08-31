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
public class ejercicio02 {
    public static void main(String[] args) {
        int i;
        int [] numero = new int [5];
        for(i=0;i<numero.length;i++) {
            System.out.println("Ingrese un valor entero");
            numero [i] = TecladoIn.readLineInt();
        }    
        for (i=0;i<numero.length;i++){
            if (i == (numero.length -1)){
                System.out.print(numero[i]);
            }else{
                System.out.print(numero[i] + "-");
            }
        }
    }
    
}
