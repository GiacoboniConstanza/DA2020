/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Coqui
 */
public class insercion {

    public static void main(String[] args) {
        int p, j, temp;
        int[] a = {1,9,3,5,8,4};
        for (p = 1; p < (a.length); p++) {
            temp = a[p];
            j = p;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        mostrar(a);
    }
    public static void mostrar (int[]a){
        int b;
        for (b=0;b<a.length;b++){
            System.out.print(a[b]+"-");
        }
    }
}
