/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPO1;

/**
 *
 * @author Coqui
 */
public class Producto {
    //variables
    private int codigo;
    private String nombre;
    private String marca;
    private int cantStock;
    private double precio;
    private boolean oferta;
    
    //constructoras
    public Producto (int codigo){
        this.codigo = codigo;
    }
    public Producto (int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = verificarNom(nombre);
    }
    public Producto (int codigo,String nombre,String marca,int cantStock, double precio){
    this.codigo = codigo;
    this.nombre = verificarNom(nombre);
    this.marca = marca;
    this.cantStock = cantStock;
    this.precio = precio;
    revisarOferta();
}
    
    //observadors
    public int getCodigo (){
        return codigo;
    }
    public String getNombre (){
        return nombre;
    }
    public String getMarca (){
        return marca;
    }
    public int getCantStock (){
        return cantStock;
    }
    public double getPrecio (){
        return precio;
    }
    public boolean getOferta  (){
        return oferta;
    }
    public boolean equals (Producto p1){
        return codigo == p1.codigo;
    }
    public String toString (){
        return "Código: "+codigo+" - Nombre: "+nombre
                + " - Marca: "+marca+" - Cantidad en Stock: "+cantStock
                + " - Precio: "+precio+" - Oferta: "+oferta;
    }
    
    //modificadoras
    public void setNombre (String nombre){
        this.nombre = verificarNom(nombre);
    }

    public void setMarca (String marca){
        this.marca = marca;
    }
    public void setCantStock (int cantStock){
        this.cantStock = cantStock;
    }
    public void setPrecio (double precio){
        this.precio = precio;
    }
    
    //propias del tipo
    public void actualizarStock (int unidades){
        cantStock += unidades;
        revisarOferta();
    }
    public String hacerPedido (){
        if (cantStock<10){
            return "Hacer pedido \n"
                    + "Nombre: "+nombre+"\n"
                    + "Codigo: "+codigo+"\n"
                    + "Marca: "+marca;
        }else{
            return "No es necesario hacer un pedido";
        }
    }
    public void vender (int unidades){
        cantStock -= unidades;
        revisarOferta();
    }
    private boolean revisarOferta (){
        if (cantStock > 50){
            oferta = true;
        }else{
            oferta = false;
        }
        return oferta;
    }
    //metodo propio del tipo para analizar string y que el nombre del producto sea una sola palabra
    private String verificarNom (String cadena){
        int i=0;
        char c;
        String nombre="";
        boolean valor=false;
        while ((i<cadena.length())&&valor==false){
            c = cadena.charAt(i);
            valor = separador(c);
            nombre += c;
            i++;
        }
        return nombre;
    }
    private boolean separador(char c) {
        boolean valor;
        valor = (c==' ' || c==',' || c=='.' || c==';');
        return valor;
    }
}
