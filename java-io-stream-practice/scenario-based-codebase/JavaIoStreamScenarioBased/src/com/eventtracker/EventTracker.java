package com.eventtracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class EventTracker {

    public static void trackEvents(Class<?> clazz, String outputJsonFile) 
    {
        Method[] methods = clazz.getDeclaredMethods();
        List<EventLog> logs = new ArrayList<>();

        for (Method method : methods) 
        {
            if (method.isAnnotationPresent(AuditTrail.class)) 
            {
                AuditTrail annotation = method.getAnnotation(AuditTrail.class);
                logs.add(new EventLog(clazz.getSimpleName(), method.getName(), annotation.action()));
            }
        }

        // Write logs to JSON file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(outputJsonFile)) 
        {
            gson.toJson(logs, writer);
            System.out.println("Audit JSON log generated at: " + outputJsonFile);
        } catch (IOException e) {
            System.out.println("Error writing JSON file: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        trackEvents(UserActions.class, "audit_logs.json");
    }
}
