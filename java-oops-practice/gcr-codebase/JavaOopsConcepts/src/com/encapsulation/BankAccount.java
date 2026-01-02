package com.encapsulation;

//Abstract class representing a bank account
public abstract class BankAccount {

 // Encapsulated fields
 private String accountNumber;
 private String holderName;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, String holderName, double balance) 
 {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     setBalance(balance);
 }

 // Getters 
 public String getAccountNumber() 
 {
     return accountNumber;
 }

 public String getHolderName()
 {
     return holderName;
 }

 protected double getBalance() 
 {
     return balance;
 }

 // Setter with validation
 protected void setBalance(double balance) 
 {
     if (balance >= 0) 
     {
         this.balance = balance;
     }
 }

 // Concrete method to deposit money
 public void deposit(double amount) 
 {
     if (amount > 0) 
     {
         balance += amount;
         System.out.println("Deposited: " + amount);
     }
 }

 // Concrete method to withdraw money
 public void withdraw(double amount) 
 {
     if (amount > 0 && amount <= balance) 
     {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } 
     else 
     {
         System.out.println("Insufficient balance or invalid amount");
     }
 }

 // Abstract method to calculate interest
 public abstract double calculateInterest();

 // Common method
 public void displayAccountDetails() 
 {
     System.out.println("Account No : " + accountNumber);
     System.out.println("Holder    : " + holderName);
     System.out.println("Balance   : " + balance);
 }
}
