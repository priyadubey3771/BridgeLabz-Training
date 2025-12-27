package com.constructor.level1;

public class BankAccountDriver {
  public static void main(String[] args) {

     SavingsAccount savings = new SavingsAccount("ACC12345", "Priya Dubey", 50000.0, 4.5);

     // Displaying account details
     savings.displayAccountDetails();

     System.out.println("\nUpdating Balance...\n");
     // Modifying balance using public setter
     savings.setBalance(55000.0);

     // Displaying updated account details
     savings.displayAccountDetails();
  }
 }
