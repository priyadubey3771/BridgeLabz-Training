package com.exceptionhandling.throwvsthrows;

public class Driver{
    public static void main(String[] args){
    	
        InterestCalculator ic = new InterestCalculator();

        try
        {
            double interest = ic.calculateInterest(10000, 5, 2);
            System.out.println("Calculated Interest: " + interest);

            // Try invalid input
            interest = ic.calculateInterest(-5000, 5, 2);
            System.out.println("Calculated Interest: " + interest);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
