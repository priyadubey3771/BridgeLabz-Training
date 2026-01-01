package com.objectmodeling;

//Account class represents a bank account
 public class Account {

 private String accountNumber;
 private double balance;

 // Constructor
 public Account(String accountNumber, double balance) 
 {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Getter method to view balance
 public double getBalance() 
 {
     return balance;
 }
// Method to deposit money
 public void deposit(double amount) 
 {
     if (amount > 0) 
     {
         balance += amount;
     }
 }
}
