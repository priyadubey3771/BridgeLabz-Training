package com.annotations.logging;

import java.lang.reflect.Method;
public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = TaskProcessor.class;
            Object obj = cls.getDeclaredConstructor().newInstance();

            for (Method method : cls.getDeclaredMethods()) 
            {

                if (method.isAnnotationPresent(LogExecutionTime.class)) 
                {

                    long start = System.nanoTime();

                    method.invoke(obj);

                    long end = System.nanoTime();

                    System.out.println("Execution time of " + method.getName() + ": " 
                                       + (end - start) + " ns");
                }
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
