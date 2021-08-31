/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP05;

/**
 *
 * @author Coqui
 */
public class ejercicio04 {
    public static void main(String[] args) {
        int [] arreglo = {1,2,3};
        int n=2;
        verificar(arreglo,n);
    }
    public static void verificar(int[]arreglo,int n){
        int i=0;
        boolean encontrado=false;
        
        while(i<arreglo.length&&(!encontrado)){
            if (arreglo[i]==n){
                encontrado=true;
            }
            i++;
        }
        if (encontrado){
            System.out.println(n + " se encuentra en el arreglo");
        }else{
            System.out.println(n+" no se encuentra en el arreglo");
        }
    }
}
