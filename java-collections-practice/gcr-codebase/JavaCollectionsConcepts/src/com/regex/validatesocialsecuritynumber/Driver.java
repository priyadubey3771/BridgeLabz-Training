package com.regex.validatesocialsecuritynumber;

public class Driver{
    public static void main(String[] args){
    	
        SSNValidator ssnVal = new SSNValidator();

        // Valid
        ssnVal.validateSSN("123-45-6789"); 
        // Invalid   
        ssnVal.validateSSN("123456789"); 
        // Invalid
        ssnVal.validateSSN("12-345-6789");  
    }
}
