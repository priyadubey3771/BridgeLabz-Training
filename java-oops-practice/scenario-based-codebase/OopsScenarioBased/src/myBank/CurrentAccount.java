package myBank;

class CurrentAccount extends Account implements Transaction {

 private double interestRate = 2.0;

 public CurrentAccount(int accountNumber) 
 {
     super(accountNumber);
 }

 // Deposit money
 public void deposit(double amount) 
 {
     addBalance(amount);
     System.out.println("Amount deposited in Current Account");
 }

 // Withdraw money
 public void withdraw(double amount) 
 {
     if (deductBalance(amount)) 
     {
         System.out.println("Amount withdrawn from Current Account");
     } 
     else 
     {
         System.out.println("Insufficient balance");
     }
 }

 // Check balance
 public void checkBalance() 
 {
     System.out.println("Current Account Balance: ₹" + getBalance());
 }

 // interest calculation for current account
 @Override
 public double calculateInterest() {
     return getBalance() * interestRate / 100;
 }
}
