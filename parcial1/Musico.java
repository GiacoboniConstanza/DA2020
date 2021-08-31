/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Coqui
 */
public class Musico {
    private String nombre;
    private int dni;
    private char instrumento;
    private int cantAnios;
    private boolean solista;
    
    //Constructores
    public Musico (String nombre, int dni, char instrumento, int cantAnios, boolean solista){
        this.nombre = nombre;
        this.dni = dni;
        this.cantAnios = verificarAnios(cantAnios);
        this.solista = solista;
        this.instrumento = verificarInstrumento(instrumento);
        
    }
    public Musico (int dni){
        this.dni = dni;
    }
    
    //Observadoras
    public String getNombre (){
        return nombre;
    }
    public int getDni (){
        return dni;
    }
    public char getInstrumento (){
        return instrumento;
    }
    public int getCantAnios (){
        return cantAnios;
    }
    public boolean getSolista (){
        return solista;
    }
    public boolean equals (Musico m1){
        return dni == m1.dni;
    }
    public String toString (){
        return "Nombre: "+nombre+" DNI: "+dni+"\n"
                + "Instrumento: "+instrumento+" Cantidad de Años: "+cantAnios+"\n"
                + "Ha sido solista en alguna obra: "+solista;
    }
    
    //Modificadoras
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setInstrumento (char instrumento){
        this.instrumento = verificarInstrumento(instrumento);
    }
    public void setCantAnios (int cantAnios){
        this.cantAnios = cantAnios;
    }
    public void setSolista (boolean solista){
        this.solista=solista;
    }
    
    //Propias del tipo
    private char verificarInstrumento (char instrumento){
        if (instrumento == 'M' ||instrumento == 'm' ||instrumento == 'I' ||instrumento == 'i' ||instrumento == 'C' ||instrumento == 'c' ||instrumento == 'A' ||instrumento == 'a'){
            return instrumento;
        }else{
            instrumento = ' ';
            return instrumento;
        }
        
    }
    private int verificarAnios (int anios){
        if (anios>0){
            return anios;
        }else{
            anios=0;
            return anios;
        }
    }
}
