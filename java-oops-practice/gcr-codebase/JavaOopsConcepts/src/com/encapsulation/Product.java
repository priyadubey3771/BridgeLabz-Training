package com.encapsulation;

//Abstract class representing product
public abstract class Product {

 // Encapsulated fields
 private int productId;
 private String name;
 private double price;

 // Constructor
 public Product(int productId, String name, double price) 
 {
     this.productId = productId;
     this.name = name;
     setPrice(price); 
 }

 // Getters
 public int getProductId() 
 {
     return productId;
 }

 public String getName() 
 {
     return name;
 }

 protected double getPrice() 
 {
     return price;
 }

 // Setter 
 public void setPrice(double price) 
 {
     if (price > 0)
     {
         this.price = price;
     }
 }

 // Abstract method
 public abstract double calculateDiscount();

 // Concrete method shared by all products
 public void displayDetails() 
 {
     System.out.println("Product ID : " + productId);
     System.out.println("Name       : " + name);
     System.out.println("Price      : " + price);
 }
}
