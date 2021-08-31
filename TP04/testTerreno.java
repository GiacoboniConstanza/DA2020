/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP04;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class testTerreno {

    public static void main(String[] args) {

        int cod, man;
        double ba, al, perimetro, superficie, valorLimp, valorTer, precio;
        
        
        //datos del terreno ingresados por el usuario
        System.out.println("Ingrese el codigo");
        cod = TecladoIn.readLineInt();
        System.out.println("Ingrese la manzana");
        man = TecladoIn.readLineInt();
        System.out.println("Ingrese la base");
        ba = TecladoIn.readLineDouble();
        System.out.println("Ingrese la altura");
        al = TecladoIn.readLineDouble();
        
        
        //declaracion del terreno con datos correspondientes
        Terreno t1 = new Terreno(cod, ba, al, man);
        
        //calculo perimetro
        perimetro = t1.perimetro();
        System.out.println("El perimetro del terreno es " + perimetro);
        
        //calcula cantidad de alambre
        System.out.println("Para cercar el terreno y de 3 vueltas se necesita " + 3 * perimetro + " metros de alambre");
        

        //calculo superficie
        superficie = t1.superficie();
        //calculo valor de limpieza
        valorLimp = t1.valor(150);
        System.out.println("La superficie del terreno es " + superficie + " metros cuadrados");
        System.out.println("El costo de limpieza total es " + valorLimp + " siendo $150 por metro cuadrado");
        

        //calculo valor del terreno
        System.out.println("Ingrese el valor de metro cuadrado del terreno");
        precio = TecladoIn.readLineDouble();
        valorTer = t1.valor(precio);
        System.out.println("El valor del terreno es " + valorTer);
    }
    
}
