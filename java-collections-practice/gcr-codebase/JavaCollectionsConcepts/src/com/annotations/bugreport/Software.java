package com.annotations.bugreport;

public class Software {

    @BugReport(description = "Null pointer issue when input is empty")
    @BugReport(description = "Performance issue for large data")
    public void process() 
    {
        System.out.println("Processing...");
    }
}
