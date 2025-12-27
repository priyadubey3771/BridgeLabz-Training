package com.constructor.level1;

public class Circle {

    private double radius;
    
    // Default constructor
    public Circle() 
    {
    	// constructor chaining
        this(1.0); 
    }

    // Parameterized constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }
}

