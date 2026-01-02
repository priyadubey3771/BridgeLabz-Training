package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ECommerceDriver {
   public static void main(String[] args) {

        // Product reference
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice Bag", 1200));

        // Calculate and display final price
        for (Product product : products) 
        {

            product.displayDetails();

            double tax = 0;

            if (product instanceof Taxable) 
            {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                System.out.println("Tax Details : " + taxable.getTaxDetails());
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount    : " + discount);
            System.out.println("Final Price : " + finalPrice);
            System.out.println("--------------------------------");
        }
    }
}
