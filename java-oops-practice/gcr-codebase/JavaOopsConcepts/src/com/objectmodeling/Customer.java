package com.objectmodeling;

public class Customer {

 private String customerName;
 private Account account;
 private Bank bank;

 // Constructor
 public Customer(String customerName, Bank bank) 
 {
     this.customerName = customerName;
     this.bank = bank;
 }

 // Method to open account using Bank
 public void openAccount(String accountNumber, double balance) 
 {
     account = bank.openAccount(accountNumber, balance);
 }

 // Method to view account balance
 public void viewBalance() 
 {
     System.out.println("Customer Name: " + customerName);
     System.out.println("Bank Name: " + bank.getBankName());
     System.out.println("Account Balance: ₹" + account.getBalance());
 }
}

