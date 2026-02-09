package com.shoppingecommerce;

import java.util.*;

public class Driver {
   public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000),
                new Product("Headphones", 2000),
                new Product("Mouse", 700),
                new Product("Keyboard", 1500),
                new Product("Charger", 400));

        // 1. Lambda to apply 10% discount
        products.forEach(p -> {
            double discountedPrice = p.getPrice() * 0.90;
            System.out.println(p.getName() + " Discounted Price: " + discountedPrice);
        });

        System.out.println("-----");

        // 2. Sort products by price using lambda
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);

        System.out.println("-----");

        // 3. Lambda to check free delivery eligibility (amount > 500)
        products.forEach(p -> {
            if (p.getPrice() > 500)
            System.out.println(p.getName() + " is eligible for Free Delivery");
        });

        System.out.println("-----");

        // 4. Lambda to calculate final bill amount
        double totalBill = 0;
        for (Product p : products) 
        {
            totalBill += p.getPrice();
        }
        System.out.println("Total Bill Amount: " + totalBill);

        System.out.println("-----");

        // 5. Lambda to print product names
        products.forEach(p -> System.out.println(p.getName()));
    }
}
