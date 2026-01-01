package com.objectmodeling;

//Driver class to demonstrate Association
public class BankAssociationDriver {
  public static void main(String[] args) {

     // Creating Bank object
     Bank sbi = new Bank("State Bank of India");

     // Creating Customer object
     Customer customer1 = new Customer("Priya Dubey", sbi);

     // Opening account
     customer1.openAccount("SBI12345", 10000.0);

     // Viewing balance
     customer1.viewBalance();
 }
}

