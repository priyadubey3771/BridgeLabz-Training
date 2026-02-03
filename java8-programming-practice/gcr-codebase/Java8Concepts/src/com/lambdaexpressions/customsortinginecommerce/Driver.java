package com.lambdaexpressions.customsortinginecommerce;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
    	
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Smartphone", 20000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smartwatch", 8000, 4.3, 20));

        System.out.println("Original List:");
        products.forEach(System.out::println);

        // Sort by price, ascending
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        // Sort by rating, descending
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by discount, descending
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
