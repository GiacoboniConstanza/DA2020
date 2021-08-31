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
public class Fecha {
    
    //variables
    private int dia;
    private int mes;
    private int anio;
    
    //constructores
    public Fecha(int elDia, int elMes, int elAnio) {
       setDia(elDia,elMes,elAnio);
    }
    //observadores
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }
    //modificadores
    public void setDia(int elDia) {
        if (elDia > 31 || elDia < 1) {
            dia = 0;
        } else {
            if (elDia < 29) {
                dia = elDia;
            } else {
                switch (elDia) {

                    case 29:
                        if (mes == 2) {
                            if (esBisiesto()) {
                                dia = elDia;
                            } else {
                                dia = 0;
                            }
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 30:
                        if (mes == 2) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 31:
                        if (mes == 2 || mes == 11 || mes == 4 || mes == 6 || mes == 9) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;
                }
            }
        }

    }

    public void setDia(int elDia, int elMes, int elAnio) {
        if (elDia > 31 || elDia < 1) {
            dia = 0;
        } else {
            if (elDia < 29) {
                dia = elDia;
            } else {
                switch (elDia) {
                    case 29:
                        if (elMes == 2) {
                            if (esBisiesto(elAnio)) {
                                dia = elDia;
                            } else {
                                dia = 0;
                            }
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 30:
                        if (elMes == 2) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 31:
                  if (elMes == 2 || elMes == 11 || elMes == 4 || elMes == 6 || elMes == 9) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;
                }
            }
        }

    }

    public void setMes(int elMes) {
        if (elMes > 0 && elMes < 13) {
            mes = elMes;
        } else {
            mes = 0;
        }
    }

    public void setAnio(int elAnio) {
        anio = elAnio;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    //Propios del Tipo
    public boolean esBisiesto() {
        boolean bisiesto = false;

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            bisiesto = true;
        }

        return bisiesto;

    }

    public boolean esBisiesto(int elAnio) {
        boolean bisiesto = false;

        if ((elAnio % 4 == 0) && ((elAnio % 100 != 0) || (elAnio % 400 == 0))) {
            bisiesto = true;
        }

        return bisiesto;

    }
    /*Implementar un TDA Fecha que permita almacenar una fecha (día, mes y año) y realizar las
operaciones propias de fecha:
a. diasTranscurridos (dada una fecha calcula la cantidad de días transcurridos en el año).
b. esFechaAnterior, que verifique si una fecha es anterior a otra.
c. calculaFecha, que dada una fecha y una cantidad de días indique cuál será esa fecha.
*/
    
}
