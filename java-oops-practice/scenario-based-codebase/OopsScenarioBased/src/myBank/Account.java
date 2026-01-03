package myBank;

class Account {

 protected int accountNumber;   
 private double balance;       

 // Constructor with opening balance
 public Account(int accountNumber, double balance) 
 {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Constructor without opening balance
 public Account(int accountNumber) 
 {
     this.accountNumber = accountNumber;
     this.balance = 0.0;
 }

 // Protected method to add balance
 protected void addBalance(double amount) 
 {
     balance += amount;
 }

 // Protected method to deduct balance safely
 protected boolean deductBalance(double amount) 
 {
     if (amount <= balance) 
     {
         balance -= amount;
         return true;
     }
     return false;
 }

 // Public method to check balance
 public double getBalance() 
 {
     return balance;
 }

 public double calculateInterest()
 {
     return 0;
 }
}
