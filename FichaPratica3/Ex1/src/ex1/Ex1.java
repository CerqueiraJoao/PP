/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;
/**
 *
 * @author joaod
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int N = 3;
        Scanner num=new Scanner(System.in);

        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j<N; j++){
                System.out.println("Numero: ");
                A[i][j] = num.nextInt();
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j<N; j++){
                B[j][i] = A[i][j];
            }
        }
        System.out.println("Matriz A: ");
         for(int i = 0; i < N; i++){
            for(int j = 0; j<N; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
         System.out.println("Matriz B (Transposta: ");
         for(int i = 0; i < N; i++){
            for(int j = 0; j<N; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
