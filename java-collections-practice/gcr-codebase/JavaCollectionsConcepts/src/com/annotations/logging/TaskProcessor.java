package com.annotations.logging;

public class TaskProcessor {

    @LogExecutionTime
    public void fastTask() 
    {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void slowTask() 
    {
        for (int i = 0; i < 1000000; i++);
    }

    public void normalTask()
    {
        for (int i = 0; i < 100000; i++);
    }
}
