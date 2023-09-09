/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassChallange;

/**
 *
 * @author Pandawan
 */
public class Account {
    private int accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    //Constructor
    public Account() {
    }

    public Account(int accountNumber, float accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    //Setter and Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    //Methods
    public boolean deposit(float amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber
                                + "\nCurrent Balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }
    
    public boolean withdraw(float amount) {
        if (amount > 0 && amount <= accountBalance) {
            this.accountBalance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber
                                + "\nCurrent Balance: " + accountNumber);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }

    @Override
    public String toString() {
        return """
               Account Information:
               Account Number: """ + accountNumber 
                            + "\nCustomer Name: " + customerName       
                            + "\nEmail: " + email 
                            + "\nPhone Number: " + phoneNumber
                            + "\nAccount Balance: $" + accountBalance;
    }
}
