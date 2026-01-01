package com.inheritance.hierarchicalinheritance;

public class BankAccountDriver {
   public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA202", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD303", 100000, 24);

        BankAccount[] accounts = { acc1, acc2, acc3 };

        for (BankAccount acc : accounts) 
        {
            System.out.println("---------------------------");

            //determining actual account type at runtime
            if (acc instanceof SavingsAccount) 
            {
                ((SavingsAccount) acc).displayDetails();
            }
            else if (acc instanceof CheckingAccount) 
            {
                ((CheckingAccount) acc).displayDetails();
            } 
            else if (acc instanceof FixedDepositAccount) 
            {
                ((FixedDepositAccount) acc).displayDetails();
            }
        }
    }
}
