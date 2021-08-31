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
public class testProducto {

    public static void main(String[] args) {
        Producto arreglo[] = new Producto[30];
        int contador;
        System.out.println("Ingrese datos de cada producto");
        contador = cargaArreglo(arreglo);
        mostrarMenu();
        seleccion(arreglo, contador);
    }

    public static void mostrarMenu() {
        System.out.println("\n"
                + "------Menú de opciones------\n"
                + "1. Mostrar todos los productos\n"
                + "2. Vender (dado un código y cantidad de unidades)\n"
                + "3. Mostrar el nombre de todos los productos de una misma marca\n"
                + "4. Adquirir productos (dado un producto y cantidad de unidades)\n"
                + "5. Verificar si hay al menos un producto en oferta\n"
                + "6. Listar los productos en oferta\n"
                + "7. Salir\n"
                + "");
    }
    public static void seleccion (Producto []arreglo, int contador){
        int opcion;
        do {
            System.out.println("Ingrese una opcion");
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 1:System.out.println("Listado de productos");muestraProductos(arreglo, contador);break;
                case 2:vender(arreglo, contador);break;
                case 3:muestraProdMismaMarca(arreglo, contador);break;
                case 4:adquirirProd(arreglo, contador);break;
                case 5:verificarOferta(arreglo, contador);break;
                case 6:muestraProdOferta(arreglo, contador);break;
                case 7:System.out.println("Gracias por haber usado el programa");break;
                default:System.out.println("Opcion ingresada incorrecta");break;
            }
            if (opcion != 7) {
                mostrarMenu();
            }
        } while (opcion != 7);
    }
    
    public static void vender(Producto[] arreglo, int j) {
        int cod, unidades, i = 0, prod = 0;
        Producto p;
        boolean encontrado = false;
        System.out.println("Ingrese el código del producto");
        cod = TecladoIn.readLineInt();
        p = new Producto(cod);
        System.out.println("Ingrese la cantidad de unidades");
        unidades = TecladoIn.readLineInt();
        //recorrido parcial para encontrar el producto en el arreglo
        while ((encontrado == false) && i < j) {
            if (arreglo[i].equals(p)) {
                encontrado = true;
                prod = i;
            }
            i++;
        }
        if (encontrado == true) {
            //verificar que haya stock
            if ((arreglo[prod].getCantStock()) >= unidades) {
                arreglo[prod].vender(unidades);
                System.out.println("Quedan "+ arreglo[prod].getCantStock()+" unidades");
            } else {
                System.out.println("La venta no se puede realizar debido que hay poco stock");
            }
        } else {
            System.out.println("El código no se encuentra cargado");
        }

    }

    public static void muestraProdMismaMarca(Producto[] arreglo, int j) {
        int i;
        String marca;
        System.out.println("Ingrese marca");
        marca = TecladoIn.readLine();
        for (i = 0; i < j; i++) {
            if ((arreglo[i].getMarca()).equalsIgnoreCase(marca)) {
                System.out.println(arreglo[i].getNombre());
            }
        }
    }

    public static void adquirirProd(Producto[] arreglo, int j) {
        int unid, i = 0, prod = 0, codigo;
        String nombre;
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del producto");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese el codigo del producto");
        codigo = TecladoIn.readLineInt();
        Producto p = new Producto(codigo, nombre);
        System.out.println("Ingrese la cantidad de unidades");
        unid = TecladoIn.readLineInt();
        while ((encontrado == false) && i < j) {
            if (arreglo[i].equals(p)) {
                encontrado = true;
                prod = i;
            }
            i++;
        }
        if (encontrado == false) {
            System.out.println("El producto no se encuentra cargado");
        } else {
            arreglo[prod].actualizarStock(unid);
            System.out.println("El stock actual es: " + arreglo[prod].toString());
        }

    }

    public static void verificarOferta(Producto[] arreglo, int j) {
        int i = 0;
        boolean encontrado = false;
        while ((encontrado == false) && i < j) {
            if (arreglo[i].getOferta() == true) {
                encontrado = true;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("Hay al menos un producto en oferta");
        } else {
            System.out.println("No hay productos en oferta");
        }
    }

    public static void muestraProdOferta(Producto[] arreglo, int j) {
        int i;
        for (i = 0; i < j; i++) {
            if (arreglo[i].getOferta() == true) {
                System.out.println(arreglo[i].toString());
            }
        }
    }

    public static int cargaArreglo(Producto arreglo[]) {
        int i = 0;
        boolean continuar = true;
        while (continuar && i < arreglo.length) {
            arreglo[i] = cargaProducto();
            i++;
            System.out.println("Desea continuar? true o false");
            continuar = TecladoIn.readLineBoolean();

        }
        return i;
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

    public static void muestraProductos(Producto[] arreglo, int j) {
        int i;
        for (i = 0; i < j; i++) {
            System.out.println(arreglo[i].toString());
        }
    }
}
