/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP03;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio02 {
     public static void main(String[] args) {
         int [][] matriz;
         int fila, col;
         System.out.println("Ingrese una cantidad de filas");
         fila = TecladoIn.readLineInt();
         System.out.println("Ingrese una cantidad de columnas");
         col = TecladoIn.readLineInt();
         matriz = new int [fila][col];
         cargarMatriz(matriz);
         mostrarMatriz(matriz);
     }
    public static void cargarMatriz (int[][]matriz){
        int fila, col, i, j, valor;
        fila = matriz.length;
        col = matriz[0].length;
        for (i=0;i<fila;i++){
            for(j=0;j<col;j++){
                System.out.println("Ingrese un valor");
                valor=TecladoIn.readLineInt();
                matriz[i][j]=valor;
            }
        }
    }
    public static void mostrarMatriz (int[][]matriz){
        int fila, col, i, j;
        fila = matriz.length;
        col = matriz[0].length;
        for (i=0;i<fila;i++){
            for(j=0;j<col;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
