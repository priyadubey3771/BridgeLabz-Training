package com.regex.validatecreditcardnumber;

public class Driver{
    public static void main(String[] args){
    	
        CreditCardValidator ccv = new CreditCardValidator();

        // Valid Visa
        ccv.validateCard("4123456789012345"); 
        // Valid MasterCard
        ccv.validateCard("5123456789012345"); 
        // Invalid
        ccv.validateCard("6123456789012345"); 
        // Invalid 
        ccv.validateCard("412345678901234");  
        
    }
}
