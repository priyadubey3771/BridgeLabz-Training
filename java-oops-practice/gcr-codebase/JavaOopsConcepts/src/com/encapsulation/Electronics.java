package com.encapsulation;

public class Electronics extends Product implements Taxable {

 public Electronics(int productId, String name, double price) 
 {
     super(productId, name, price);
 }

 // 10% discount on electronics
 @Override
 public double calculateDiscount() 
 {
     return getPrice() * 0.10;
 }

 // 18% tax on electronics
 @Override
 public double calculateTax() 
 {
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() 
 {
     return "18% GST on Electronics";
 }
}
