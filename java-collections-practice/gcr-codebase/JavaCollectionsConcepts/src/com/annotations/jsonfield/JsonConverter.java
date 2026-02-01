package com.annotations.jsonfield;

import java.lang.reflect.Field;
public class JsonConverter {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) 
        {

            if (field.isAnnotationPresent(JsonField.class)) 
            {

                field.setAccessible(true);

                try 
                {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String jsonKey = annotation.name();
                    Object value = field.get(obj);

                    if (!first) 
                    {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    if (value instanceof String) 
                    {
                        json.append("\"").append(value).append("\"");
                    } 
                    else 
                    {
                        json.append(value);
                    }

                    first = false;

                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}
