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
public class ejercicio03 {
    public static void main(String[] args) {
        char [][]matriz;
        char a;
        int i, j, n;
        System.out.println("Ingrese la dimension de la matriz");
        n = TecladoIn.readLineInt();
        matriz = new char [n][n];
        cargarMatriz(matriz);
        mostrarDiagonal(matriz);
    }
    public static void cargarMatriz (char[][]matriz){
        int fila, col, i, j;
        char valor;
        fila = matriz.length;
        col = matriz[0].length;
        for (i=0;i<fila;i++){
            for(j=0;j<col;j++){
                System.out.println("Ingrese un valor");
                valor=TecladoIn.readLineNonwhiteChar();
                matriz[i][j]=valor;
            }
        }
    }
    public static void mostrarDiagonal (char[][]matriz){
        int fila, i;
        fila = matriz.length;
        for (i=0;i<fila;i++){
            System.out.print(matriz[i][i] + " ");
        }
    }
}
