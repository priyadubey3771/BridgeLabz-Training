package com.regex.validateipaddress;

public class Driver{
    public static void main(String[] args){
    	
        IPAddressValidator ipVal = new IPAddressValidator();

        // Valid
        ipVal.validateIPAddress("192.168.1.1"); 
        // Valid
        ipVal.validateIPAddress("255.255.255.255"); 
        // Invalid
        ipVal.validateIPAddress("256.100.50.0"); 
        // Invalid
        ipVal.validateIPAddress("192.168.1");      
    }
}
