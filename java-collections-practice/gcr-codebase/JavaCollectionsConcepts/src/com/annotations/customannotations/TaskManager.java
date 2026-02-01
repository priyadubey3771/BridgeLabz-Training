package com.annotations.customannotations;

public class TaskManager {

    @ImportantMethod
    public void completeTask() 
    {
        System.out.println("Task completed");
    }

    @ImportantMethod(level = "MEDIUM")
    public void reviewTask() 
    {
        System.out.println("Task reviewed");
    }

    public void normalTask() 
    {
        System.out.println("Normal task executed");
    }
}
