package EWalletApplication;

public class EWalletApp {
  public static void main(String[] args) {

        // Creating wallets
        Wallet personalWallet = new PersonalWallet(5000);
        Wallet businessWallet = new BusinessWallet(10000, 1000);

        // Creating users
        User u1 = new User(1, "Amit", personalWallet);
        User u2 = new User(2, "Neha", businessWallet);

        // Transfer operations
        u1.getWallet().transferTo(u2, 1000);
        u2.getWallet().transferTo(u1, 2000);

        // Displaying balances
        System.out.println("Amit Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Neha Balance: ₹" + u2.getWallet().getBalance());

        System.out.println("\nAmit Transactions:");
        u1.getWallet().showTransactions();

        System.out.println("\nNeha Transactions:");
        u2.getWallet().showTransactions();
    }
}
