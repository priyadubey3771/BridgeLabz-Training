package com.regex.validateusername;

public class Driver{
  public static void main(String[] args){
    	
        UsernameValidator uv = new UsernameValidator();

        // Valid
        uv.validateUsername("user_123"); 
        // Invalid
        uv.validateUsername("123user");  
        // inValid
        uv.validateUsername("us");       
    }
}
