package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Aman", 250.50),
                new Order("Priya", 300.00),
                new Order("Aman", 150.00),
                new Order("Sneha", 500.75),
                new Order("Priya", 200.25));

        // Sum order totals per customer
        Map<String, Double> revenuePerCustomer = orders.stream().collect(Collectors.groupingBy(Order::getCustomerName,Collectors.summingDouble(Order::getAmount)));

        // Print the result
        revenuePerCustomer.forEach((customer, total) ->System.out.println(customer + " : " + total));
        
    }
}
