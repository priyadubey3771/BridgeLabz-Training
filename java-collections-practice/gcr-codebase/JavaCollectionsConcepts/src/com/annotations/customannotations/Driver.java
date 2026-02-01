package com.annotations.customannotations;

import java.lang.reflect.Method;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = TaskManager.class;

            System.out.println("Annotated methods in TaskManager:");

            for (Method method : cls.getDeclaredMethods()) 
            {
            	if (method.isAnnotationPresent(ImportantMethod.class)) 
            	{
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("- Method: " + method.getName() + ", Level: " + annotation.level());
                }
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
