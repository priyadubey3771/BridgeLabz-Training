package com.medwarehouse;

class Medicine {

	 String name;
	 int expiryDate;
	
	 // constructor
	 Medicine(String name, int expiryDate)
	 {
	     this.name = name;
	     this.expiryDate = expiryDate;
	 }
	
	 // display medicine details
	 void display() 
	 {
	     System.out.println("Medicine: " + name +", Expiry Day: " + expiryDate);
	 }
 
}
