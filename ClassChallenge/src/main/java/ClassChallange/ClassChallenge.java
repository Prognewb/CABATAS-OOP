/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassChallange;

/**
 *
 * @author User
 */
public class ClassChallenge {
    public static void main(String[] args) {
        Account person1 = new Account(12345, 1000, "Niño Jan", "niojan@gmail.com", "0987-654-3210");
        
        System.out.println(person1.toString());

        person1.deposit(500);
        person1.withdraw(200);

        System.out.println("Account Balance: $" + person1.getAccountBalance());
    }
}
