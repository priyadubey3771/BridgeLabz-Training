package com.constructor.level1;

public class Product {

 // Instance variables 
 private String productName;
 private double price;

 // Class variable 
 private static int totalProducts = 0;

 // Parameterized constructor that initializes product details and increments total product count
 public Product(String productName, double price) 
 {
     this.productName = productName;
     this.price = price;
     totalProducts++; 
 }

 // Instance method to displays details of a single product
 public void displayProductDetails() 
 {
     System.out.println("Product Name: " + productName);
     System.out.println("Price: " + price);
 }

 // class method to display total number of products created
 public static void displayTotalProducts() 
 {
     System.out.println("Total Products: " + totalProducts);
 }
}
