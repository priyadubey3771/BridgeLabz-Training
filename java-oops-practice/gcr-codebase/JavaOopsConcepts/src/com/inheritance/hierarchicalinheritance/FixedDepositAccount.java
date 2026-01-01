package com.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {

 private int depositPeriod;

 public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) 
 {
     super(accountNumber, balance);
     this.depositPeriod = depositPeriod;
 }

 @Override
 public String displayAccountType() 
 {
     return "Fixed Deposit Account";
 }

 public void displayDetails() 
 {
     displayAccountDetails();
     System.out.println("Account Type: " + displayAccountType());
     System.out.println("Deposit Period: " + depositPeriod + " months");
 }
}
