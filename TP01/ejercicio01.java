/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio01 {
     public static void main(String[] args) {
         String frase, fraseInv;
         System.out.println("Ingrese una frase");
         frase = TecladoIn.readLine();
         fraseInv = invertir(frase);
         System.out.println(fraseInv);
     }

    private static String invertir(String frase) {
        String fraseInv = "", palabra = "";
        int i, iFinal;
        char c;
        iFinal = (frase.length());
        i = 0;
        while ((i < iFinal)) {
            c = frase.charAt(i);
            if (separador(c)) {
                while (separador(c)){
                    i++;
                    c = frase.charAt(i);
                }
                fraseInv = palabra + " " + fraseInv;
                palabra = "";
                
            } else {
                palabra = palabra + c;
                i++;
            }
            
            
        } 
        fraseInv = palabra + " "+ fraseInv;
        return fraseInv;
    }

    private static boolean separador(char c) {
        boolean valor;
        valor = (c==' ' || c==',' || c=='.' || c==';');
        return valor;
    }
    
}
