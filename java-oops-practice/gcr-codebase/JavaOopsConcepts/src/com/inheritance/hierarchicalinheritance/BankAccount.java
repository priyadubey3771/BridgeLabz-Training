package com.inheritance.hierarchicalinheritance;

//Superclass representing a bank account
public class BankAccount {

 protected String accountNumber;
 protected double balance;

 // Constructor
 public BankAccount(String accountNumber, double balance) 
 {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to display common account details
 public void displayAccountDetails() 
 {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }

 // Method to be overridden by subclasses
 public String displayAccountType() 
 {
     return "Generic Bank Account";
 }
}
