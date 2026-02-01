package com.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = Class.forName("com.reflection.accessandmodifystaticfields.Configuration");

            // Access private static field
            Field field = cls.getDeclaredField("API_KEY");

            // Make it accessible
            field.setAccessible(true);

            // Modify static field ,object is null for static
            field.set(null, "NEW_SECRET_KEY_123");

            Configuration.showKey();

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
