/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP02;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio08 {
     public static void main(String[] args) {
         char [] arreglo = new char [100];
         int carga, opcion;
         //cargamos el arreglo
        carga=cargarArreglo(arreglo);
         //mostrar cuantas posiciones han sido cagadas
         System.out.println("Se han cargado " + carga + " posiciones");
         //mostrar menu de opciones
         menuOpciones();
         System.out.println("Seleccione una opcion");
         opcion=TecladoIn.readLineInt();
         seleccion(opcion, arreglo, carga);
     }

    public static int cargarArreglo(char arreglo[]) {
        int i=0;
        char c;
        boolean continuar=true;
        while(continuar && i<arreglo.length){
            System.out.println("Ingrese un caracter");
            c=TecladoIn.readLineNonwhiteChar();
            arreglo[i]=c;
            i++;
            System.out.println("Desea continuar? true o false");
            continuar=TecladoIn.readLineBoolean();
            
        }
        return i;
    }
    public static void menuOpciones (){
        System.out.println("------ menu ------ \n"
                + "1. Mostrar arreglo \n"
                + "2. Verificar un caracter \n"
                + "3. Repeticion de un caracter");
        
    }
    public static void seleccion (int opcion, char [] arreglo, int i){
        int repeticion;
        switch (opcion){
            case 1: mostrarArreglo(arreglo, i); break;
            case 2: if (verificarCaracter(arreglo,i)==true){
                System.out.println("El caracter se encuentra en el arreglo");
            }else{
                System.out.println("El caracter no se encuentra en el arreglo");
            }
            break;
            case 3: repeticion=repeticionCaracter(arreglo,i); System.out.println("La cantidad de repeticiones es " + repeticion);break;
            default: System.out.println("Opcion ingresada incorrecta");
        }
    }
    public static void mostrarArreglo (char [] arreglo, int j){
        int i;
        for (i=0;i<j;i++){
            
                System.out.print (arreglo[i] + "-");
            
            
        }
    }
    public static boolean verificarCaracter (char [] arreglo, int j){
        char c;
        int i=0;
        boolean encontrado=false;
        System.out.println("Ingrese el caracter a verificar");
        c=TecladoIn.readLineNonwhiteChar();
        while (encontrado==false && i<j){
            if (arreglo[i]==c){
                encontrado=true;
            }
            i++;
        }
        return encontrado;
    }
    public static int repeticionCaracter(char[]arreglo, int j){
        int i, contador=0;
        char c;
        System.out.println("Ingrese el caracter a verificar");
        c=TecladoIn.readLineNonwhiteChar();
        for (i=0;i<j;i++){
            if (arreglo[i]==c){
               contador++; 
            }
        }
        return contador;
    }
}
