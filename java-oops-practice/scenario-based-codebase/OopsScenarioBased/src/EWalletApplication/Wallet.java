package EWalletApplication;

import java.util.ArrayList;

//Abstract class representing a wallet
abstract class Wallet implements Transferrable {

 // Balance is private to prevent direct access
 private double balance;

 // List to store transactions
 protected ArrayList<Transaction> transactions = new ArrayList<>();

 // Constructor without referral bonus
 public Wallet(double balance) 
 {
     this.balance = balance;
 }

 // Overloaded constructor with referral bonus
 public Wallet(double balance, double referralBonus) 
 {
     this.balance = balance + referralBonus;
 }

 // Public getter to access balance safely
 public double getBalance() 
 {
     return balance;
 }

 // Protected method to update balance internally
 protected void updateBalance(double amount) 
 {
     balance += amount;
 }

 // Displaying transaction history
 public void showTransactions() 
 {
     for (Transaction t : transactions) 
     {
         t.displayTransaction();
     }
 }
}
