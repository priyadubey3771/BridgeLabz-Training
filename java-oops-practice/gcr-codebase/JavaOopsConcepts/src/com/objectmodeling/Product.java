package com.objectmodeling;

public class Product {

 private String productName;
 private double price;

 // Constructor
 public Product(String productName, double price) 
 {
     this.productName = productName;
     this.price = price;
 }

 // Getters
 public String getProductName() 
 {
     return productName;
 }

 public double getPrice()
 {
     return price;
 }
}
