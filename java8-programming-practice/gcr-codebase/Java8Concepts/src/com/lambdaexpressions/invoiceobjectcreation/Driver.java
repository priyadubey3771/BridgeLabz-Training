package com.lambdaexpressions.invoiceobjectcreation;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
    	
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        // Using constructor reference to create Invoice objects
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
        
    }
}
