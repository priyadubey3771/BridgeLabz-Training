package com.implementbankingsystem;

//represents a bank account
public class Account {

	 private String accountNumber;
	 private double balance;
	
	 public Account(String accountNumber, double balance) 
	 {
	     this.accountNumber = accountNumber;
	     this.balance = balance;
	 }
	
	 public String getAccountNumber()
	 {
	     return accountNumber;
	 }
	
	 public double getBalance() 
	 {
	     return balance;
	 }
	
	 public void withdraw(double amount) 
	 {
	     balance -= amount;
	 }
	
	 @Override
	 public String toString() 
	 {
	     return "Account " + accountNumber + " | Balance: " + balance;
	 }
	 
}
