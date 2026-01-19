package com.generics.smartwarehousemanagementsystem;

class Electronics extends WarehouseItem {

 // Constructor
 public Electronics(String name, int quantity) 
 {
     super(name, quantity);
 }

 // category specific to electronics
 @Override
 public String getCategory() 
 {
     return "Electronics";
 }
}
//groceries item class
class Groceries extends WarehouseItem {

 public Groceries(String name, int quantity) 
 {
     super(name, quantity);
 }

 @Override
 public String getCategory() 
 {
     return "Groceries";
 }
}
//furniture item class
class Furniture extends WarehouseItem {

 public Furniture(String name, int quantity) 
 {
     super(name, quantity);
 }

 @Override
 public String getCategory() 
 {
     return "Furniture";
 }
}
