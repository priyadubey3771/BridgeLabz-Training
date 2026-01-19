package com.dynamiconlinemarketplace;

//generic Product class
class Product<T extends Category> 
{
  // product details
	 private String name;
	 private double price;
	 private T category;

	 // constructor 
	 public Product(String name, double price, T category) 
	 {
	     this.name = name;
	     this.price = price;
	     this.category = category;
	 }
	
	 // getter for product name
	 public String getName() 
	 {
	     return name;
	 }
	
	 // getter for product price
	 public double getPrice() 
	 {
	     return price;
	 }
	
	 // setter for product price 
	 public void setPrice(double price) 
	 {
	     this.price = price;
	 }
	
	 // getter for category
	 public T getCategory() 
	 {
	     return category;
	 }
}
