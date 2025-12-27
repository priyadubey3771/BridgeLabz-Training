package com.constructor.level1;

public class CircleDriver {

 public static void main(String[] args) {
		
	// Using default constructor
	Circle circle1 = new Circle();
	System.out.println("Radius (default): " + circle1.getRadius());

   // Using parameterized constructor
	Circle circle2 = new Circle(5.5);
	System.out.println("Radius (user-defined): " + circle2.getRadius());
	
	}
 }


	


