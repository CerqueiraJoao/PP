/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author joaod
 */

public class Ex1 {

    /**
     * @param args the command line arguments
     */
    
    
    
    static User user1;
    public static void main(String[] args) {
        // TODO code application logic here
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','g','m','a','i','l','.','c','o','m'};
        
        System.out.println("----User 1----");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
    }
    
}
