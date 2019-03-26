/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author joaod
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int v = 0;
        int c = 0;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == 'a' || nome[i] == 'e' || nome[i] == 'i' || nome[i] == 'o' || nome[i] == 'u' || nome[i] == 'A' || nome[i] == 'E' || nome[i] == 'I' || nome[i] == 'O' || nome[i] == 'U') {
                v++;
            } else if (nome[i] == ' ' || nome[i] == '\n') {

            } else {
                c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }

}
