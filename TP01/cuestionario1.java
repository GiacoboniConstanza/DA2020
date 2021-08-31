/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

/**
 *
 * @author Coqui
 */
public class cuestionario1 {
    public static void main(String[] args) {
boolean algo;
int[][] matriz =  {{1,2,3},{1,2,3},{1,2,3}};
algo=verifica(matriz);
System.out.println(algo);

    }
    public static boolean verifica(int[][] ma){
     int suma, primera, filas, columnas;
     boolean bien=true;
     primera =-10;
     filas=ma.length;
     columnas=ma[0].length;
     for (int i=0; i<filas; i++){
          suma=0;
          for (int j=0; j<columnas; j++)
               suma=suma+ma[i][j];
               if (primera==-10)
                    primera=suma;
               else
                    bien=bien && primera==suma;
          }
     return bien;
}
}
