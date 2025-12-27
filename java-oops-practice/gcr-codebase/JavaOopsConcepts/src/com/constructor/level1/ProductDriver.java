package com.constructor.level1;

public class ProductDriver {
  public static void main(String[] args) {

        // Creating Product objects
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Mobile Phone", 25000.0);

        // Displaying individual product details
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println();
        // Calling class method using class name
        Product.displayTotalProducts();
     }
  }
