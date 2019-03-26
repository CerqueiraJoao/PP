/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author joaod
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ListaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] ListaB = {6, 99, -1, 12, 1, -2};

        int[] unir = new int[20];
        int[] novoVetor = new int[20];
        int [] vetor2 = new int [5];
        int c1 = 0;
        int r = 0;
        int f = 0;
        int c = 0;
        int k = 0;

        for (int i = 0; i < ListaA.length; i++) {
            System.out.print(ListaA[i] + " ");
            unir[i] = ListaA[i];
            c1++;
        }
        System.out.print("\n");

        for (int i = 0; i < ListaB.length; i++) {
            System.out.print(ListaB[i] + " ");
            unir[c1] = ListaB[i];
            c1++;
        }
        System.out.print("\n");
        System.out.print("Vetor final: ");

        for (int i = 0; i < c1; i++) {
            System.out.print(unir[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < ListaA.length; i++) {
            for (int j = 0; j < ListaB.length; j++) {
                if (ListaA[i] == ListaB[j]) {
                    r++;
                    vetor2[k] = ListaA[i];
                }
            }
        }
        System.out.println("Valores repetidos: " + r);
        
        for (int i = 0; i < ListaA.length; i++) {
            for (int j = 0; j < ListaB.length; j++) {
                if (ListaA[i] == ListaB[j]) {
                    f = j;
                }
            }
            if (f == 0) {
                novoVetor[c] = ListaA[i];
                c++;
            } else {
                f = 0;
            }
        }
        System.out.print("Vetor C: ");
        
        for (int i = 0; i < c; i++) {
            System.out.print(novoVetor[i] + " ");
        }
        
        System.out.println("\nNovo vetor: " + vetor2[k]);
        
    }
}


