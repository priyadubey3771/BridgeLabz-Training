package com.reflection.generatejsonrepresentation;

import java.lang.reflect.Field;
public class JsonUtil {
public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) 
        {
        	fields[i].setAccessible(true);

            try 
            {
                String name = fields[i].getName();
                Object value = fields[i].get(obj);

                json.append("\"").append(name).append("\": ");

                if (value instanceof String) 
                {
                    json.append("\"").append(value).append("\"");
                } 
                else 
                {
                    json.append(value);
                }

                if (i < fields.length - 1) 
                {
                    json.append(", ");
                }

            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
