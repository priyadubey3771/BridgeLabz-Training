package com.zipzipmart;

// represents a sales transaction
class SalesRecord {

    String date;     
    double amount;

    // Constructor
    public SalesRecord(String date, double amount) 
    {
        this.date = date;
        this.amount = amount;
    }

    // Display record
    public void display() 
    {
        System.out.println(date + " | Amount: " + amount);
    }
}
