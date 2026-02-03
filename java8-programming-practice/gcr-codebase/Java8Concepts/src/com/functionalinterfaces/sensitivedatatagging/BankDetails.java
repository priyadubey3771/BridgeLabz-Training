package com.functionalinterfaces.sensitivedatatagging;

public class BankDetails implements SensitiveData {

    private String accountNumber;

    public BankDetails(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public String getData() 
    {
        return "Account Number: " + accountNumber;
    }
}
