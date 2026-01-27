package com.exceptionhandling.banktransactionsystem;

class BankAccount
{
    double balance;

    BankAccount(double balance)
    {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException();
        }

        if (amount > balance)
        {
            throw new InsufficientBalanceException();
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
