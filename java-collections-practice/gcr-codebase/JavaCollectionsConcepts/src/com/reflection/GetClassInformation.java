package com.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInformation {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter full class name (e.g., java.util.ArrayList): ");
    String className = sc.nextLine();

    try 
    {
        // load class dynamically
        Class<?> cls = Class.forName(className);

        System.out.println("\nClass Name: " + cls.getName());
        System.out.println("-----------------------");

        // display constructors
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) 
        {
            System.out.println(constructor);
        }

        // display fields
        System.out.println("\nFields:");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) 
        {
            System.out.println(field);
        }

        // display methods
        System.out.println("\nMethods:");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) 
        {
            System.out.println(method);
        }

    } 
    catch (ClassNotFoundException e) 
    {
        System.out.println("Class not found. Please enter a valid class name.");
    }

        sc.close();
    }
}


