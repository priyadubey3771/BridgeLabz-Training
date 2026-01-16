package com.smartcheckout;

import java.util.List;

// represents a supermarket customer
class Customer {

    String name;
    List<String> items;

    public Customer(String name, List<String> items) 
    {
        this.name = name;
        this.items = items;
    }
}
