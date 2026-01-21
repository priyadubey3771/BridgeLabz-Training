package com.implementbankingsystem;

import java.util.*;

public class BankingSystem {

 //HashMap for accountNumber- Account
 private Map<String, Account> accountMap = new HashMap<>();

 //withdrawal processing
 private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

 // add new account
 public void addAccount(Account account) 
 {
     accountMap.put(account.getAccountNumber(), account);
 }

 // add withdrawal request to queue
 public void requestWithdrawal(WithdrawalRequest request) 
 {
     withdrawalQueue.add(request);
 }

 // process withdrawal requests
 public void processWithdrawals() 
 {
	 while (!withdrawalQueue.isEmpty()) 
     {
    	 WithdrawalRequest request = withdrawalQueue.poll();
         Account account = accountMap.get(request.getAccountNumber());

         if (account != null && account.getBalance() >= request.getAmount()) 
         {
             account.withdraw(request.getAmount());
             System.out.println("Withdrawal successful: " + request.getAmount() + " from Account " + request.getAccountNumber());
         } 
         else 
         {
             System.out.println("Withdrawal failed for Account "+ request.getAccountNumber());
         }
     }
 }

 // display customers sorted by balance
 public void displayAccountsSortedByBalance() 
 {

     //TreeMap for balance - accountNumber
     TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

     for (Account account : accountMap.values()) 
     {
         sortedMap.computeIfAbsent(account.getBalance(), k -> new ArrayList<>()).add(account.getAccountNumber());
     }

     System.out.println("\nAccounts sorted by balance:");
     for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) 
     {
         for (String accNo : entry.getValue()) 
         {
             System.out.println("Account " + accNo + " | Balance: " + entry.getKey());
         }
     }
 }
 
}
