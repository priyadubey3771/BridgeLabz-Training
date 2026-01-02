package EWalletApplication;

//BusinessWallet extends Wallet
class BusinessWallet extends Wallet {

 private double transactionTax = 0.02;

 // Constructor with referral bonus
 public BusinessWallet(double balance, double referralBonus) 
 {
     super(balance, referralBonus);
 }

 // Business wallet applies tax on transfers
 @Override
 public void transferTo(User receiver, double amount) 
 {

     double tax = amount * transactionTax;
     double totalDeduction = amount + tax;

     if (getBalance() >= totalDeduction) 
     {

         // Deduct amount + tax
         updateBalance(-totalDeduction);

         // Credit receiver
         receiver.getWallet().updateBalance(amount);

         // Record transaction
         transactions.add(new Transaction("Business Transfer", amount));
     }
 }
}
