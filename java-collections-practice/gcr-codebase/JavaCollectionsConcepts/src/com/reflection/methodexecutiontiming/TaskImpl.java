package com.reflection.methodexecutiontiming;

public class TaskImpl implements Task {

    @Override
    public void performTask() 
    {
        try 
        {
        	// Simulate long task
            Thread.sleep(1000);  
            System.out.println("Task completed");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
