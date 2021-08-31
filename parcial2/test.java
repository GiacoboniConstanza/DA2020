/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class testo {

    /*Especifique en java un algoritmo RECURSIVO que calcule la suma
    de los cuadrados de los digitos pares del numero. Ej. Si el numero
    de entrada es 234 la suma de los cuadrados es igual a   22  + 42 = 20.*/
    public static void main(String arg[]) {
        int n;
        System.out.println("Ingrese un numero");
        n = TecladoIn.readLineInt();
        System.out.println(digito(n, 0));
    }

    public static double digito(int n, double acum) {
        int par;
        if (n > 0) {
            par = n % 10;
            if (par % 2 == 0) {
                acum = (par * par) + acum;
            }
            acum = digito(n / 10, acum);
        }
        return acum;
    }
}
