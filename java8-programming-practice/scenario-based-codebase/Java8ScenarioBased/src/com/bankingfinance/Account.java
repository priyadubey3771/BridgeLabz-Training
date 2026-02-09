package com.bankingfinance;

public class Account {

    String holderName;
    double balance;

    public Account(String holderName, double balance) 
    {
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName() 
    { 
    	return holderName; 
    }
    public double getBalance() 
    { 
    	return balance; 
    }

    @Override
    public String toString() 
    {
        return holderName + " | Balance: " + balance;
    }
}
