/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class testMusico {
    public static void main(String[] args) {
        Musico arreglo[];
        int contador, opcion;
        System.out.println("Ingrese la cantidad de músicos a cargar");
        contador = TecladoIn.readLineInt();
        arreglo=new Musico [contador];
        System.out.println("Ingrese los datos de los músicos");
        cargaArreglo(arreglo);
        do{
            opcion = mostrarMenu();
            switch (opcion){
                case 1: cordofonos(arreglo);break;
                case 2: antiguedad(arreglo);break;
                case 3: System.out.println("Gracias por haber usado el programa");break;
                default: System.out.println("Opcion incorrecta");break;
            }
        }while(opcion!=3);
        
    }
    
    public static void cargaArreglo (Musico arreglo[]){
        int i;
        for (i=0;i<arreglo.length;i++){
            arreglo[i]=cargaMusico();
        }   
    }
    
    public static Musico cargaMusico(){
        String nombre;
        int dni, cantAnios;
        char instrumento;
        boolean solista;
        Musico m;
        
        System.out.println("Ingrese el nombre");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese el dni");
        dni = TecladoIn.readLineInt();
        System.out.println("Ingrese el tipo de instrumento: M, C, I, A");
        instrumento = TecladoIn.readLineNonwhiteChar();
        System.out.println("Ingrese la cantidad de años que pertence a la orquesta");
        cantAnios = TecladoIn.readLineInt();
        System.out.println("Ingrese si ha estado como solista en una obra");
        solista = TecladoIn.readLineBoolean();
        
        m = new Musico (nombre, dni, instrumento, cantAnios, solista);
        return m;
    }
    
    public static int mostrarMenu (){
        int op;
        System.out.println("------Menú------\n"
                + "1. Muestra el músico más antiguo que tocan intrumentos cordófonos\n"
                + "2. Muestra un músico con más de 3 años de antiguedad y nombre con \n"
                + "más de 2 vocales.\n"
                + "3. Salir\n"
                + "");
        System.out.println("Ingrese una opcion");
        op = TecladoIn.readLineInt();
        return op;
    }
    
    public static void cordofonos (Musico arreglo[]){
        int i;
        Musico m = new Musico ("",0,'C',0,false);
        boolean encontrado = false;
        for (i=0;i<arreglo.length;i++){
            if (arreglo[i].getInstrumento()=='c'||arreglo[i].getInstrumento()=='C'){
                if (arreglo[i].getCantAnios()> m.getCantAnios()){
                   m = arreglo[i];
                   encontrado = true;
                }
            }
        }
        if (encontrado){
             System.out.println("El músico más antiguo de los cordófonos es:\n"
                + ""+ m.toString());
        }else{
            System.out.println("No hay un músico que cumpla con las condiciones requeridas");
        }
       
    }
    
    public static void antiguedad (Musico arreglo[]){
        int i, vocales=0;
        boolean encontrado=false;
        String nombre;
        Musico m = new Musico ("",0,'C',0,false);
        for(i=0;i<arreglo.length;i++){
            if (arreglo[i].getCantAnios()>3){
                    nombre = arreglo[i].getNombre();
                    vocales = recorrerNombre(nombre);
                    if (vocales>2){
                        m=arreglo[i];
                        encontrado = true;
                    }
                }
        }
        if (encontrado){
            System.out.println("El músico con mayor antiguedad y más de 2 vocales en el nombre es:\n"
                    + ""+m.toString());
        }else{
            System.out.println("No hay un músico que cumpla con las condiciones requeridas");
        }
    }
    
    public static int recorrerNombre (String nombre){
        int i=0, vocales=0;
        char c;
        nombre = nombre.toLowerCase();
        while (vocales<3 && i<nombre.length()){
            c = nombre.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vocales++;
            }
            i++;
        }
        return vocales;
    }
}
