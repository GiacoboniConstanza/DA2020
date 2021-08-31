/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio01 {

    public static void main(String[] args) {
        int num, i, resultado;
        System.out.println("Ingrese un numero");
        num = TecladoIn.readLineInt();
        for (i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.print(" " + resultado + " ");
        }
    }

}
