/*0
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
public class ejercio05 {
    public static void main(String[] args) {
        int n=2;
        int [][]matriz = new int[n][n];
        cargar(matriz);
    }
    public static void cargar(int[][]matriz){
        int i,j,a;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.println("Ingrese un numero");
                a = TecladoIn.readLineInt();
                matriz[i][j]=a;
            }
        }
    }
}
