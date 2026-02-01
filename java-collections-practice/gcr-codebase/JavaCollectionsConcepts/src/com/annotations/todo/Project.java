package com.annotations.todo;

public class Project {

    @Todo(task = "Implement login feature", assignedTo = "Priya")
    public void login() 
    {
        System.out.println("Login feature not yet implemented");
    }

    @Todo(task = "Add reporting module", assignedTo = "Rahul", priority = "HIGH")
    public void reports() 
    {
        System.out.println("Reports module pending");
    }

    public void completedFeature() 
    {
        System.out.println("Completed feature executed");
    }
}
