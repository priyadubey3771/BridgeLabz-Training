package com.callcenter;

// represents customer
class Customer {

 String customerId; 
 String name;
 boolean isVIP;       

 // Constructor to initialize customer details
 public Customer(String customerId, String name, boolean isVIP)
 {
     this.customerId = customerId;
     this.name = name;
     this.isVIP = isVIP;
 }
}
