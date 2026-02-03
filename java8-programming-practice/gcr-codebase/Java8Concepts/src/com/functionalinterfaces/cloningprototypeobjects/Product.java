package com.functionalinterfaces.cloningprototypeobjects;

public class Product implements Cloneable {

    private String name;
    private double price;

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone(); // shallow copy
    }

    public void display() 
    {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
