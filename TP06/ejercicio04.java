/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP06;

/**
 *
 * @author Coqui
 */
public class ejercicio04 {
    public static void main(String[] args) {
        int num = 111;
       igual(num);
    }
    public static int igual(int num) {
        boolean verificar=false;
        if (num > 0) {
            if (num == igual(num % 10)) {
                verificar = true;
            }
        }
        System.out.println(verificar);
     return num; 
    }
}
