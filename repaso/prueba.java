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
public class prueba {

    public static void main(String[] args) {
        String a1;
        int largo;
        System.out.println("Ingrese la palabra a invertir y concatenar");
        a1 = TecladoIn.readLine();
        largo = a1.length()-1;
        algo1(a1,largo);
        algo2(a1,largo);
    }

    public static void algo1(String i, int nro) {
        if (nro > (-1)) {
            //System.out.print(i.charAt(nro));
            algo1(i, nro - 1);
            System.out.print(i.charAt(nro));
        }

    }

    public static void algo2(String i, int nro) {
        if (nro > (-1)) {
            System.out.print(i.charAt(nro));
            algo1(i, nro - 1);
        }

    }
}
