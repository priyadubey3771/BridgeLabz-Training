package com.junit.testing;

public class PerformanceTestingUsingTimeOut
{
    public String longRunningTask() throws InterruptedException
    {
        Thread.sleep(3000);
        return "Task Completed";
    }
}


