package com.regex.validatelicenseplatenumber;

public class Driver{
    public static void main(String[] args){
    	
        LicensePlateValidator lpv = new LicensePlateValidator();

        // Valid
        lpv.validateLicensePlate("AB1234"); 
        // Invalid
        lpv.validateLicensePlate("A12345"); 
        // Invalid
        lpv.validateLicensePlate("abc123");  
        
    }
}
