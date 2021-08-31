/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPO1;

import utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class test {
    public static void main(String[] args) {
        Producto [] a;
        int b, cod;
        b=TecladoIn.readLineInt();
        a = new Producto [b];
        cargaArreglo(a);
        verificar(a,b,3);
    }
    public static void cargaArreglo(Producto arreglo[]) {
        int i = 0;
        boolean continuar = true;
        while (continuar && i < arreglo.length) {
            arreglo[i] = cargaProducto();
            i++;
            System.out.println("Desea continuar? true o false");
            continuar = TecladoIn.readLineBoolean();
        }
    }
     public static Producto cargaProducto() {
        int codigo, cantStock;
        String nombre, marca;
        double precio;

        System.out.println("Ingrese el código");
        codigo = TecladoIn.readLineInt();
        System.out.println("Ingrese el nombre");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese la marca");
        marca = TecladoIn.readLine();
        System.out.println("Ingrese la cantidad en Stock");
        cantStock = TecladoIn.readLineInt();
        System.out.println("Ingrese el precio");
        precio = TecladoIn.readLineDouble();
        Producto p = new Producto(codigo, nombre, marca, cantStock, precio);
        return p;
    }
    public static void verificar (Producto [] arreglo, int cont,int codigo){
        int inicio=0, fin=cont, resultado=(-1), medio, pos =0;
        while(inicio <=fin){
            medio = (inicio+fin)/2;
            if (codigo==(arreglo[medio].getCodigo())){
                resultado = medio;
                inicio = fin + 1;
                pos = medio;
            }else{
                if(codigo < arreglo[medio].getCodigo()){
                    fin = medio - 1;
                }else{
                    inicio = medio + 1;
                }
            }
        }
        if (resultado < 0){
            System.out.println("El codigo no se encuentra cargado en el arreglo");
        }else{
            System.out.println("El codigo se encuentra cargado en el arreglo");
            System.out.println(arreglo[pos].toString());
        }
    }
}
