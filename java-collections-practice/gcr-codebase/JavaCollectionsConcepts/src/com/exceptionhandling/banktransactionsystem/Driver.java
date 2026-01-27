package com.exceptionhandling.banktransactionsystem;

public class Driver{
   public static void main(String[] args){
    	
        BankAccount account = new BankAccount(5000);

        try
        {
            account.withdraw(2000);   // Valid
            account.withdraw(6000);   // Insufficient balance
            account.withdraw(-100);   // Invalid amount
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid amount!");
        }
    }
}
