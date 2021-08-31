/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP04;

/**
 *
 * @author Coqui
 */
public class Terreno {
    //variables

    private int codigo;
    private double base;
    private double altura;
    private int manzana;
    //Constructores

    public Terreno(int cod) {
        base = 0;
        altura = 0;
    }

    public Terreno(int cod, double ba, double al, int man) {
        codigo = cod;
        base = ba;
        altura = al;
        manzana = man;
    }

    //observadores
    public int getCodigo() {
        return codigo;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public int getManzana() {
        return manzana;
    }

    public String toString() {
        return "El codigo es " + codigo + ", manzana " + manzana;
    }

    public boolean equals(Terreno ter) {
        return ter.base == base && ter.altura == altura && ter.codigo == codigo && ter.manzana == manzana;
    }

    //modificadores
    public void setManzana(int man) {
        manzana = man;
    }

    public void setBase(double ba) {
        base = ba;
    }

    public void setAltura(double al) {
        altura = al;
    }

    //propias del tipo
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    public double superficie() {
        return base * altura;
    }

    public double valor(double precio) {
        return superficie() * precio;
    }
}
