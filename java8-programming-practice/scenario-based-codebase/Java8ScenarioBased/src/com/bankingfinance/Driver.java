package com.bankingfinance;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Driver {
  public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Amit", 8000),
                new Account("Neha", 3000),
                new Account("Ravi", 15000),
                new Account("Priya", 5000));

        // 1. Lambda to check minimum balance rule (min balance = 5000)
        Predicate<Account> minBalanceRule = acc -> acc.getBalance() >= 5000;
        accounts.forEach(acc -> {
            if (minBalanceRule.test(acc))
                System.out.println(acc.getHolderName() + " maintains minimum balance");
            else
                System.out.println(acc.getHolderName() + " does NOT maintain minimum balance");
        });

        System.out.println("-----");

        // 2. Lambda to calculate simple interest
        BiFunction<Double, Double, Double> simpleInterest = (principal, time) -> (principal * 5 * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest.apply(10000.0, 2.0));

        System.out.println("-----");

        // 3. Lambda to validate withdrawal amount
        BiPredicate<Account, Double> validWithdrawal = (acc, amount) -> amount <= acc.getBalance();

        Account acc = accounts.get(0);
        double withdrawAmount = 2000;
        if (validWithdrawal.test(acc, withdrawAmount))
            System.out.println("Withdrawal allowed for " + acc.getHolderName());
        else
            System.out.println("Insufficient balance");

        System.out.println("-----");

        // 4. Lambda to print account details
        accounts.forEach(a -> System.out.println(a));

        System.out.println("-----");

        // 5. Lambda to compare two account balances
        Comparator<Account> balanceComparator = (a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance());

        Account a1 = accounts.get(0);
        Account a2 = accounts.get(1);

        if (balanceComparator.compare(a1, a2) > 0)
            System.out.println(a1.getHolderName() + " has higher balance");
        else
            System.out.println(a2.getHolderName() + " has higher balance");
    }
}
