package com.functionalinterfaces.cloningprototypeobjects;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Product original = new Product("Laptop", 75000);
            Product cloned = (Product) original.clone();

            original.display();
            cloned.display();

        } 
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
    }
}
