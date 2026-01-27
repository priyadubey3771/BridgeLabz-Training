package com.exceptionhandling.nestedtrycatchblock;

public class Driver
{
    public static void main(String[] args)
    {
        NestedExceptionHandler neh = new NestedExceptionHandler();

        int[] numbers = {10, 20, 30, 40, 50};

        // Valid
        neh.performOperation(numbers, 2, 5);  
        // Invalid index
        neh.performOperation(numbers, 10, 5);  
        neh.performOperation(numbers, 1, 0);   
    }
}
