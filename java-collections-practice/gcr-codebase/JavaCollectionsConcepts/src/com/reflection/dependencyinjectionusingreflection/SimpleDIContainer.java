package com.reflection.dependencyinjectionusingreflection;

import java.lang.reflect.Field;

public class SimpleDIContainer {
 public static <T> T getInstance(Class<T> clazz) {

        try 
        {
            // Create main object
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Scan fields
            for (Field field : clazz.getDeclaredFields()) {

                if (field.isAnnotationPresent(Inject.class)) 
                {
                	// Create dependency object
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return null;
    }
}
