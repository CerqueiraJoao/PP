/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author joaod
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int m = 1;
        int n = 0;
        int max = 0;

        for (int i = 0; i < lista.length; ++i) {
            System.out.print(" " + lista[i]);
            if (lista[i] > 0) {
                m *= lista[i];
            } else {
                n++;
            }

            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.print("\nMultip:" + m);
        System.out.print("\nNegativos:" + n);
        System.out.print("\nMax:" + max);
    }

}
