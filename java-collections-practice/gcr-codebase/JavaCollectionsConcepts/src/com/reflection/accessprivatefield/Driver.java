package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

public class Driver {
 public static void main(String[] args) {

        try 
        {
            Person person = new Person();

            Class<?> cls = person.getClass();

            Field field = cls.getDeclaredField("age");

            field.setAccessible(true);

            field.set(person, 25);

            int ageValue = (int) field.get(person);

            System.out.println("Private field 'age' after modification: " + ageValue);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
