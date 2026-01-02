package EWalletApplication;

//Represents a wallet transaction
class Transaction {

 private String type;
 private double amount;

 // Constructor
 public Transaction(String type, double amount) 
 {
     this.type = type;
     this.amount = amount;
 }

 // Display transaction details
 public void displayTransaction() 
 {
     System.out.println(type + " : ₹" + amount);
 }
}
