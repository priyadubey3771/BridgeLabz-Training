package com.encapsulation;

//Abstract class representing food item
public abstract class FoodItem {

 // Encapsulated fields
 private String itemName;
 private double price;
 private int quantity;

 // Constructor
 public FoodItem(String itemName, double price, int quantity) 
 {
     this.itemName = itemName;
     setPrice(price);
     setQuantity(quantity);
 }

 // Getters
 public String getItemName() 
 {
     return itemName;
 }

 protected double getPrice() 
 {
     return price;
 }

 protected int getQuantity() 
 {
     return quantity;
 }

 // Setters
 public void setPrice(double price) 
 {
     if (price > 0) 
     {
         this.price = price;
     }
 }

 public void setQuantity(int quantity) 
 {
     if (quantity > 0) 
     {
         this.quantity = quantity;
     }
 }

 // Abstract method to calculate total price
 public abstract double calculateTotalPrice();

 // Concrete method shared by all food items
 public void getItemDetails() 
 {
     System.out.println("Item Name : " + itemName);
     System.out.println("Price     : " + price);
     System.out.println("Quantity  : " + quantity);
 }
}
