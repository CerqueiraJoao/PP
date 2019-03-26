/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

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
        int[][] matriz = {{11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000}};
        //int total = matriz[1][2];
        int total = 0;
        float media = 0;
        for (int i = 0; i < matriz.length; ++i) {
            System.out.println(' ');
            for (int j = 0; j < matriz[i].length; ++j) {
                System.out.print(" " + matriz[i][j]);
                total += matriz[i][j];
            }
        }
        media = (float) total / matriz.length;
        System.out.println("\nTotal:" + total);
        System.out.println("\nMedia:" + media);
    }

}
