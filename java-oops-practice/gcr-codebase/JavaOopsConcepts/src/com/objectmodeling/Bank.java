package com.objectmodeling;

public class Bank {

 private String bankName;

 // Constructor
 public Bank(String bankName) 
 {
     this.bankName = bankName;
 }

 // Method to open an account for a customer
 public Account openAccount(String accountNumber, double initialBalance) 
 {
     System.out.println("Account opened at " + bankName);
     return new Account(accountNumber, initialBalance);
 }

 // Getter for bank name
 public String getBankName() 
 {
     return bankName;
 }
}
