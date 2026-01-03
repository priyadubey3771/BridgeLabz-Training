package bankingSystemWithHelperMethods;

public class BankHelperMethodsApp {
   public static void main(String[] args){

        Customer c1 = new Customer(1, "Amit");
        Customer c2 = new Customer(2, "Neha");
        Account savings = new SavingsAccount(101, c1, 8000, 5);
        Account current = new CurrentAccount(102, c2, 2000, 5000);

        // Using helper methods
        savings.deposit(2000);
        savings.withdraw(1000);
        current.deposit(3000);
        current.withdraw(4000);

        // Loan eligibility
        System.out.println("Amit loan eligible? " + savings.checkLoanEligibility());
        System.out.println("Neha loan eligible? " + current.checkLoanEligibility());

        // Discount calculation
        System.out.println("Savings discount on 5000: ₹" + savings.calculateDiscount(5000));
        System.out.println("Current discount on 12000: ₹" + current.calculateDiscount(12000));

        // Final balances
        System.out.println("Amit Balance: ₹" + savings.getBalance());
        System.out.println("Neha Balance: ₹" + current.getBalance());
    }
}
