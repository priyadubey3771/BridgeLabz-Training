package com.reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {
  public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try 
        {
            // Create object dynamically
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Loop through map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) 
            {
            	String fieldName = entry.getKey();
                Object value = entry.getValue();

                // Get field from class
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                // Set value to field
                field.set(obj, value);
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
