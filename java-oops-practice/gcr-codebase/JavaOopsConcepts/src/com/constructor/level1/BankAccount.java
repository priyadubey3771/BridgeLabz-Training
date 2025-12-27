package com.constructor.level1;

public class BankAccount {

 public String accountNumber;
 protected String accountHolder;
 private double balance;

 // Parameterized constructor
 public BankAccount(String accountNumber, String accountHolder, double balance)
 {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Public getter method to access balance
 public double getBalance() 
 {
     return balance;
 }

 // Public setter method to modify balance
 public void setBalance(double balance)
 {
     this.balance = balance;
 }
}
