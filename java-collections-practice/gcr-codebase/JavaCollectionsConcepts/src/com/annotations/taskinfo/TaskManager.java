package com.annotations.taskinfo;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Priya")
    public void completeTask() 
    {
        System.out.println("Task completed");
    }
}
