package com.smartcheckout;

import java.util.Arrays;
public class SmartCheckoutDriver {
  public static void main(String[] args) {

        SmartCheckoutManager manager = new SmartCheckoutManager();

        Customer c1 = new Customer("Amit", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Neha", Arrays.asList("Eggs", "Milk", "Eggs"));

        manager.addCustomer(c1);
        manager.addCustomer(c2);
        manager.processNextCustomer();
        manager.processNextCustomer();
        manager.displayStock();
        
    }
}
