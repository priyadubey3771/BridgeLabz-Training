package bankingSystemWithHelperMethods;

//Abstract base class for all accounts
abstract class Account implements LoanEligible {

 private int accountNumber;
 private double balance;
 private Customer customer;

 public Account(int accountNumber, Customer customer, double initialBalance) 
 {
     this.accountNumber = accountNumber;
     this.customer = customer;
     this.balance = initialBalance;
 }

 // Encapsulation
 public double getBalance() 
 {
     return balance;
 }

 //helper methods

 //Validate input
 protected boolean validateUserInput(double amount) 
 {
     return amount > 0;
 }

 //Update balance safely
 protected void updateBalance(double amount) {
     balance += amount;
 }

 //Deposit money
 public void deposit(double amount) 
 {
     if (validateUserInput(amount)) 
     {
         updateBalance(amount);
         System.out.println("Deposited ₹" + amount);
     } 
     else 
     {
         System.out.println("Invalid deposit amount");
     }
 }

 //Withdraw money
 public void withdraw(double amount) 
 {
     if (validateUserInput(amount) && amount <= balance) 
     {
         updateBalance(-amount);
         System.out.println("Withdrawn ₹" + amount);
     } 
     else 
     {
         System.out.println("Invalid or insufficient balance");
     }
 }

 // Abstract helper
 public abstract double calculateDiscount(double amount);
}

