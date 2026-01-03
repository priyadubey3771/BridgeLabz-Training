package myBank;

class SavingsAccount extends Account implements Transaction {

 private double interestRate = 5.0;

 public SavingsAccount(int accountNumber, double balance) 
 {
     super(accountNumber, balance);
 }

 // Deposit money
 public void deposit(double amount) 
 {
     addBalance(amount);
     System.out.println("Amount deposited in Savings Account");
 }

 // Withdraw money
 public void withdraw(double amount) {
     if (deductBalance(amount)) 
     {
         System.out.println("Amount withdrawn from Savings Account");
     } 
     else 
     {
         System.out.println("Insufficient balance");
     }
 }

 // Check balance
 public void checkBalance() 
 {
     System.out.println("Savings Account Balance: ₹" + getBalance());
 }

 //interest calculation for savings account
 @Override
 public double calculateInterest() 
 {
     return getBalance() * interestRate / 100;
 }
}
