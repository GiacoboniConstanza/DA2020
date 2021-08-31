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
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c, d, e, f;
        c = TecladoIn.readLineInt();
        if (c > 99 || c < 1000){
           d = c/100;
           c = c%100;
           e = c/10;
           f = c%10;
           System.out.println("El numero invertido es: " + f + e + d);
        }else{
            System.out.println("Numero ingresado no valido");
        }
            
                
    }
    
}
