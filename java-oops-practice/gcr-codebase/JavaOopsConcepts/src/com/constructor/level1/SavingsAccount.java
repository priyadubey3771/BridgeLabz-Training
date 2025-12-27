package com.constructor.level1;

public class SavingsAccount extends BankAccount {

 private double interestRate;

 // Parameterized constructor
 public SavingsAccount(String accountNumber, String accountHolder,double balance, double interestRate) 
 {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method to display savings account details
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);    
     System.out.println("Account Holder: " + accountHolder);   
     System.out.println("Balance: " + getBalance());        
     System.out.println("Interest Rate: " + interestRate + "%");
  }
 }

