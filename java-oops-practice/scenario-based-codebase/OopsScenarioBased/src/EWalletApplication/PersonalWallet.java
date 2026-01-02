package EWalletApplication;

//PersonalWallet is a type of Wallet
class PersonalWallet extends Wallet {

 // Constructor
 public PersonalWallet(double balance) 
 {
     super(balance);
 }

 // Personal wallet has no extra charges
 @Override
 public void transferTo(User receiver, double amount) 
 {

     if (getBalance() >= amount) 
     {

         // Deduct amount
         updateBalance(-amount);

         // Add amount to receiver
         receiver.getWallet().updateBalance(amount);

         // Record transaction
         transactions.add(new Transaction("Personal Transfer", amount));
     }
 }
}
