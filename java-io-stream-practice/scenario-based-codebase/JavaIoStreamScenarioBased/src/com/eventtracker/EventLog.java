package com.eventtracker;

import java.time.LocalDateTime;

public class EventLog {
    private String className;
    private String methodName;
    private String action;
    private String timestamp;

    public EventLog(String className, String methodName, String action) 
    {
        this.className = className;
        this.methodName = methodName;
        this.action = action;
        this.timestamp = LocalDateTime.now().toString();
    }

    // Getters for JSON serialization
    public String getClassName() 
    { 
    	return className; 
    }
    public String getMethodName() 
    { 
    	return methodName; 
    }
    public String getAction() 
    {
    	return action; 
    }
    public String getTimestamp() 
    { 
    	return timestamp; 
    }
}
