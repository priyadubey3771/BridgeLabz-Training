package com.functionalinterfaces.staticmethodsininterfaces;

public class Driver {
  public static void main(String[] args) {

        String password = "Insure@123";

        boolean result = SecurityUtils.isStrongPassword(password);

        if (result)
        {
            System.out.println("Strong Password");
        } 
        else 
        {
            System.out.println("Weak Password");
        }
    }
}
