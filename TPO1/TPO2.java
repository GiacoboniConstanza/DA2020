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
public class TPO2 {
     public static void main(String[] args) {
        Producto arreglo[] = new Producto[30];
        Producto a = new Producto (0,"","",0,0);
        int opcion, contador=0, codigo = 0;
        do {
            System.out.println("------Arreglos------\n"
                    + "1. Arreglo precargado. \n"
                    + "2. Cargar manualmente un arreglo.");
            System.out.println("Ingrese su eleccion.");
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 1:contador = precarga(arreglo);break;
                case 2:contador = cargaArreglo(arreglo,0);break;
                default:System.out.println("Opcion no valida");break;
            }
        } while (opcion >2);
        metodos(arreglo,contador);
        muestraProductos(arreglo,contador);
        do{
            System.out.println("------Funciones------\n"
                    + "1. Contar los productos con stock menor a 10.\n"
                    + "2. Encontrar el producto de mayor precio.\n"
                    + "3. Dado un codigo, verificar si existe.\n"
                    + "4. Ordear por el nombre.\n"
                    + "5. Agregar elementos al arreglo.\n"
                    + "6. Salir.");
            System.out.println("Ingrese su eleccion.");
            opcion = TecladoIn.readLineInt();
            switch(opcion){
                case 1:cantStock(arreglo,contador,0,0);break;
                case 2:mayorPrecio(arreglo,contador,0,0,a);break;
                case 3:
                    System.out.println("Ingrese el codigo a verificar");
                    codigo = TecladoIn.readLineInt();
                    insercion(arreglo, contador);
                    if (verificar(arreglo, contador, codigo) < 0) {
                        System.out.println("El codigo no se encuentra cargado en el arreglo");
                    } else {
                        System.out.println("El codigo se encuentra cargado en el arreglo");
                        //System.out.println(arreglo[pos].toString());
                    }
                    ;
                    break;
                case 4:ordenarNombre(arreglo,contador);muestraProductos(arreglo,contador);break;
                case 5:contador=cargaArreglo(arreglo,contador+1);metodos(arreglo,contador);muestraProductos(arreglo,contador);break;
                case 6:System.out.println("Gracias por haber usado el programa");break;
                default:System.out.println("Opcion no valida");break;
            }
        }while(opcion!=6);
    }
    public static void muestraProductos(Producto[] arreglo, int j) {
        int i;
        for (i = 0; i < j; i++) {
            System.out.println(arreglo[i].toString());
        }
    }
    public static void metodos (Producto [] arreglo, int contador){
        int opcion;
                do{
            System.out.println("------Metodos de ordenamiento------\n"
                    + "1. Burbuja mejorado.\n"
                    + "2. Seleccion.\n"
                    + "3. Insercion.");
            System.out.println("Ingrese su eleccion.");
            opcion=TecladoIn.readLineInt();
            switch (opcion) {
                case 1:burbujaMejorado(arreglo,contador);break;
                case 2:seleccion(arreglo, contador);break;
                case 3:insercion(arreglo, contador);break;
                default:System.out.println("Opcion no valida");break;
            }
        }while(opcion>3);
    }
    public static void ordenarNombre (Producto [] arreglo, int cont){
       Producto [] arregloTemp = new Producto[cont];
       mergeSort(arreglo,arregloTemp,0,cont-1);
    }
    public static void mergeSort (Producto [] arreglo,Producto [] arregloTemp, int izq,int der){
        int centro;
        if (izq < der){
            centro = (izq+der)/2;
            mergeSort(arreglo,arregloTemp,izq,centro);
            mergeSort(arreglo,arregloTemp,centro+1,der);
            mezclar(arreglo,izq,centro,der);
        }
    }
    public static void mezclar (Producto [] a, int p, int q, int r){
        int n1 = q-p+1;
        int n2 = r-q;
        
        Producto [] L = new Producto[n1];
        Producto [] M = new Producto [n2];
        
        for (int i=0;i<n1;i++){
            L[i]=a[p+i];
        }
        for (int j=0;j<n2;j++){
            M[j]=a[q+1+j];
        }
        int i=0,j=0,k=p;
        while(i<n1 && j<n2){
            if((L[i].getNombre()).compareTo((M[j].getNombre()))<0){
                a[k]=L[i];
                i++;
            }else{
                a[k]=M[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=M[j];
            j++;
            k++;
        }
    }
    public static int verificar (Producto [] arreglo, int cont,int codigo){
        int inicio=0, fin=cont, resultado=(-1), medio, pos =0;
        while(inicio <fin){
            medio = (inicio+fin)/2;
            if (codigo==(arreglo[medio].getCodigo())){
                resultado = medio;
                inicio = fin + 1;
            }else{
                if(codigo < arreglo[medio].getCodigo()){
                    fin = medio - 1;
                }else{
                    inicio = medio + 1;
                }
            }
        }
        return resultado;
    }
    public static void mayorPrecio(Producto [] arreglo, int cont, int pos, int mayorPos, Producto menor){
        if (pos == cont){
            System.out.println("El producto con mayor precio es: \n"
                     + arreglo[mayorPos].toString());
        }else{
            if(menor.getPrecio() < arreglo[pos].getPrecio()){
                menor = arreglo[pos];
                mayorPos = pos;
            }
            mayorPrecio(arreglo,cont,pos+1,mayorPos,menor);
        }
    }
    public static void cantStock (Producto [] arreglo, int cont, int pos, int total){
        if (pos == cont){
            System.out.println("Hay "+ total +" productos con stock menor a 10.");
        }else{
            if(arreglo[pos].getCantStock() < 10){
                cantStock(arreglo,cont,pos+1,total+1);
            }else{
                cantStock(arreglo, cont, pos+1,total);
            }
        }
    }
   public static int precarga(Producto[] arreglo) {
        int i = 0;
        while (i < arreglo.length) {
            arreglo[i] = cargaProductoPredet(i);
            i++;
        }
        return 8;
    }

    public static Producto cargaProductoPredet(int i) {
        Producto prod = new Producto (0,"","",0,0);
        switch (i) {
            case 0:
                prod = new Producto (8,"Té","La Virginia",69,80.99);break;
            case 1:
                prod = new Producto (5,"Pickles","Castell",20,109.33);break;
            case 2:
                prod = new Producto (4,"Mantequilla","Danica",56,180.66);break;
            case 3:
                prod = new Producto (7,"Gelatina","Exquisita",74,56.23);break;
            case 4:
                prod = new Producto (6,"Gaseosa","Pepsi",3,133.00);break;
            case 5:
                prod = new Producto (3,"Café","Cabrales",54,206.35);break;
            case 6:
                prod = new Producto (1,"Yerba","Pipore",12,305.00);break;
            case 7:
                prod = new Producto (2,"Helado","Grido",202,450.55);break;
        }
        return prod;
    }

    public static int cargaArreglo(Producto arreglo[], int i) {
        boolean continuar = true;
        while (continuar && i < arreglo.length) {
            arreglo[i] = cargaProducto(arreglo,i);
            i++;
            System.out.println("Desea continuar? true o false");
            continuar = TecladoIn.readLineBoolean();
        }
        return i;
    }

    public static Producto cargaProducto(Producto [] arreglo, int contador) {
        int codigo, cantStock;
        String nombre, marca;
        double precio;
        do {
            System.out.println("Ingrese el código");
            codigo = TecladoIn.readLineInt();
            if (verificar(arreglo, contador, codigo) < 0) {
                System.out.println("El codigo no se encuentra cargado en el arreglo, puede ser cargado");
            } else {
                System.out.println("El codigo se encuentra cargado en el arreglo, ingrese uno diferente");
                //System.out.println(arreglo[pos].toString());
            }
        }while(verificar(arreglo, contador, codigo)>0);
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
    public static void insercion(Producto[] arreglo, int cont){
        int p, j;
        Producto temp;
        for (p = 1; p < (cont); p++) {
            temp = arreglo[p];
            j = p;
            while (j > 0 && temp.getCodigo() < arreglo[j - 1].getCodigo()) {
                arreglo[j] = arreglo[j - 1];
                j = j - 1;
            }
            arreglo[j] = temp;
        }
    }
    public static void burbujaMejorado(Producto [] arreglo, int cont) {
        boolean intercambio = false;
        int i = 0, j;
        Producto aux;
        while (intercambio == false && i <= cont) {
            for (j = 0; j <= cont - 2 - i; j++) {
                if (arreglo[j].getCodigo() > arreglo[j+1].getCodigo()) {
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    intercambio = true;
                }
            }
            i++;
            if (intercambio == true) {
                intercambio = false;
            } else {
                intercambio = true;
            }
        }
    }
    public static void seleccion (Producto [] arreglo, int cont){
        int i, j, min;
        for(i=0;i<cont-1;i++){
            min = i;
            for (j=i+1;j<cont;j++){
                if (arreglo[j].getCodigo() < arreglo[min].getCodigo()){
                    min = j;
                }
            }
            intercambiar(arreglo,i,min);
        }
    }
    public static void intercambiar(Producto[]arreglo, int i, int min){
        Producto a,b;
        //guardo en una variable
        a=arreglo[i];
        b=arreglo[min];
        //cambio
        arreglo[i]=b;
        arreglo[min]=a;
    }
}
