package com.reflection.retrieveannotationsatruntime;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = Class.forName("com.reflection.retrieveannotationsatruntime.Book");

            // Check if annotation is present
            if (cls.isAnnotationPresent(Author.class))
            {
            	Author author = cls.getAnnotation(Author.class);

                System.out.println("Author Name: " + author.name());
            } 
            else 
            {
                System.out.println("No Author annotation found.");
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
