package com.implementbankingsystem;

public class Driver {
  public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // add accounts
        bank.addAccount(new Account("A101", 5000));
        bank.addAccount(new Account("A102", 12000));
        bank.addAccount(new Account("A103", 8000));

        // add withdrawal requests
        bank.requestWithdrawal(new WithdrawalRequest("A101", 2000));
        bank.requestWithdrawal(new WithdrawalRequest("A102", 5000));
        bank.requestWithdrawal(new WithdrawalRequest("A103", 10000)); // insufficient

        bank.processWithdrawals();
        bank.displayAccountsSortedByBalance();
        
    }
}
