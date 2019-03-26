/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author joaod
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int N = 5;
        Scanner num = new Scanner(System.in);

        int[] vetor = new int[N];
        int primo = 0, el = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Numero: ");
            vetor[i] = num.nextInt();
            el = vetor[i];
            primo = 1;

            for (int j = 1; j < el; j++) {
                if ((vetor[i] % j) == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println(vetor[i] + " é primo");
            }
        }
    }
}
