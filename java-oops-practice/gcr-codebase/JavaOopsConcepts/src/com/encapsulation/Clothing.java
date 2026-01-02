package com.encapsulation;

//Clothing product implementation
public class Clothing extends Product implements Taxable {

 public Clothing(int productId, String name, double price) 
 {
     super(productId, name, price);
 }

 // 20% discount on clothing
 @Override
 public double calculateDiscount() 
 {
     return getPrice() * 0.20;
 }

 // 5% tax on clothing
 @Override
 public double calculateTax() 
 {
     return getPrice() * 0.05;
 }

 @Override
 public String getTaxDetails()
 {
     return "5% GST on Clothing";
 }
}
