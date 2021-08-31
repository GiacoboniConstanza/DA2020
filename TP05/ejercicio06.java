/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP05;

import static TP05.ejercio05.cargar;

/**
 *
 * @author Coqui
 */
public class ejercicio06 {
    public static void main(String[] args) {
        int n=2;
        int [][]matriz = new int[n][n];
        cargar(matriz);
        muestra1(matriz);
    }
    public static void muestra1 (int[][]matriz){
       int i, j;
       for (i=0;i<matriz.length;i++){
           for (j=0;j<matriz[0].length;j++){
               System.out.print(matriz[i][j]+" ");
           }
           System.out.println("");
       }
       
       for (i=0;i<matriz.length;i++){
           for (j=0;j<=i;j++){
               System.out.print(matriz[i][j]+" ");
           }
           System.out.println("");
       }
    }  
}
