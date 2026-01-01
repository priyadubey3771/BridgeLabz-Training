package com.inheritance.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {

 private double withdrawalLimit;

 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) 
 {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 @Override
 public String displayAccountType() 
 {
     return "Checking Account";
 }

 public void displayDetails() 
 {
     displayAccountDetails();
     System.out.println("Account Type: " + displayAccountType());
     System.out.println("Withdrawal Limit: " + withdrawalLimit);
 }
}
