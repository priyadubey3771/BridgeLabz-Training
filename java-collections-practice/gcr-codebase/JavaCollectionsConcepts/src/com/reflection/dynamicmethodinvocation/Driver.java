package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try 
        {
        	Class<?> cls = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");

            // Creating object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = sc.nextLine();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            Method method = cls.getMethod(methodName, int.class, int.class);

            Object result = method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
