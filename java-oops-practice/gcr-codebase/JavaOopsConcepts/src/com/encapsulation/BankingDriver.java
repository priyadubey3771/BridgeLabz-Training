package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class BankingDriver {
  public static void main(String[] args) {

        // BankAccount reference
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Priya", 50000));
        accounts.add(new CurrentAccount("CA202", "Aman", 80000));

        for (BankAccount account : accounts) 
        {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Interest   : " + interest);

            // Interface-based access
            Loanable loanAccount = (Loanable) account;
            loanAccount.applyForLoan(200000);
            System.out.println("Loan Limit : " + loanAccount.calculateLoanEligibility());

            System.out.println("--------------------------------");
        }
    }
}
