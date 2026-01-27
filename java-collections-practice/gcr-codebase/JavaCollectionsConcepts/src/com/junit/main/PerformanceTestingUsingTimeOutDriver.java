package com.junit.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.PerformanceTestingUsingTimeOut;

public class PerformanceTestingUsingTimeOutDriver
{
    PerformanceTestingUsingTimeOut task = new PerformanceTestingUsingTimeOut();

    @Test
    @Timeout(2)
    void testLongRunningTask() throws InterruptedException
    {
        String result = task.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
