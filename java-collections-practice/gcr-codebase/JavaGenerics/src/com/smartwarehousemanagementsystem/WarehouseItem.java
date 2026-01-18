package com.smartwarehousemanagementsystem;

//abstract parent class representing a generic warehouse item
abstract class WarehouseItem {

 private String name;
 private int quantity;

 // constructor 
 public WarehouseItem(String name, int quantity) 
 {
     this.name = name;
     this.quantity = quantity;
 }

//getter method for item name
 public String getName() 
 {
     return name;
 }

 // getter method for item quantity
 public int getQuantity() 
 {
     return quantity;
 }

 public abstract String getCategory();
}
