package myBank;

public class MyBankApp {
  public static void main(String[] args) {

   // Creating Savings Account using interface reference
    Transaction savings = new SavingsAccount(101, 10000);
    savings.deposit(2000);
    savings.withdraw(1500);
    savings.checkBalance();

    SavingsAccount sa = (SavingsAccount) savings;
    System.out.println("Savings Interest: ₹" + sa.calculateInterest());

    System.out.println();

    // Creating Current Account using interface reference
    Transaction current = new CurrentAccount(201);
     current.deposit(5000);
      current.withdraw(2000);
      current.checkBalance();

      CurrentAccount ca = (CurrentAccount) current;
      System.out.println("Current Interest: ₹" + ca.calculateInterest());
    }
}
