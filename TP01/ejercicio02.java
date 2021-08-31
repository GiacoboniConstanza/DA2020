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
public class ejercicio02 {
    public static void main(String[] args) {
        String frase;
        char verificar;
        int palabras;
        System.out.println("Ingrese una frase");
        frase = TecladoIn.readLine();
        System.out.println("Ingrese el caracter a verificar");
        verificar = TecladoIn.readLineNonwhiteChar();
        palabras = contar(verificar,frase);
        System.out.println("El caracter " + verificar + " esta en " + palabras + " palabras");
    }

    private static int contar(char c, String cadena) {
        int i, contador = 0;
        char d;
        String palabra = "";
        for (i=0;i<cadena.length();i++){
            d = cadena.charAt(i);
            if (separador(d)){
                while(separador(d)){
                    i++;
                    d = cadena.charAt(i);
                }
                palabra = "";
            }else{
                palabra = palabra + d;
                if (cadena.charAt(i)==c){
                    contador++;
                }
            }
        }
        return contador;
    }
    private static boolean separador(char c) {
        boolean valor;
        valor = (c==' ' || c==',' || c=='.' || c==';');
        return valor;
    }
    
}
