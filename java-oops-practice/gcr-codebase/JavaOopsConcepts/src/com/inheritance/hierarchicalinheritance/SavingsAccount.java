package com.inheritance.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {

 private double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) 
 {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 @Override
 public String displayAccountType() 
 {
     return "Savings Account";
 }

 public void displayDetails() 
 {
     displayAccountDetails();
     System.out.println("Account Type: " + displayAccountType());
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

