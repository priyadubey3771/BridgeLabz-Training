package com.annotations.validation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

   public User(String username) {

        this.username = username;

        // Validate fields annotated with @MaxLength
        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) 
        {

            if (field.isAnnotationPresent(MaxLength.class)) 
            {

                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                field.setAccessible(true);
                try 
                {
                    Object value = field.get(this);
                    if (value instanceof String) 
                    {
                        String str = (String) value;
                        if (str.length() > maxLength.value()) 
                        {
                            throw new IllegalArgumentException(
                                field.getName() + " exceeds maximum length of " + maxLength.value()
                            );
                        }
                    }
                } 
                catch (IllegalAccessException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUsername() 
    {
        return username;
    }
}
