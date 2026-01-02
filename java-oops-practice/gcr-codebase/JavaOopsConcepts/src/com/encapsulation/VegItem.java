package com.encapsulation;

public class VegItem extends FoodItem implements Discountable {

 public VegItem(String name, double price, int quantity) 
 {
     super(name, price, quantity);
 }

 // Total price calculation for veg items
 @Override
 public double calculateTotalPrice() 
 {
     return getPrice() * getQuantity();
 }

 // 10% discount on veg items
 @Override
 public double applyDiscount() 
 {
     return calculateTotalPrice() * 0.10;
 }

 @Override
 public String getDiscountDetails() 
 {
     return "10% discount on Veg Item";
 }
}
