package com.encapsulation;

public class CurrentAccount extends BankAccount implements Loanable {

 private static final double INTEREST_RATE = 0.02; 

 public CurrentAccount(String accNo, String name, double balance) 
 {
     super(accNo, name, balance);
 }

 // Interest calculation for current account
 @Override
 public double calculateInterest()
 {
     return getBalance() * INTEREST_RATE;
 }

 @Override
 public void applyForLoan(double amount) 
 {
     System.out.println("Business loan applied for amount: " + amount);
 }

 @Override
 public double calculateLoanEligibility() 
 {
     return getBalance() * 10;
 }
}
