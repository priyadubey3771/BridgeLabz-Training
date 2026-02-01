package com.reflection.dynamicallycreateobjects;

public class Driver {
 public static void main(String[] args) {

        try 
        {
            Class<?> cls = Class.forName("com.reflection.dynamicallycreateobjects.Student");

            Object obj = cls.getDeclaredConstructor().newInstance();

            Student student = (Student) obj;
            student.display();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
