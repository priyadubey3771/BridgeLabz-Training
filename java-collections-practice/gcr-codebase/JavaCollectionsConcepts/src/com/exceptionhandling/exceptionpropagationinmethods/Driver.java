package com.exceptionhandling.exceptionpropagationinmethods;

public class Driver
{
    public static void main(String[] args)
    {
        ExceptionPropagation ep = new ExceptionPropagation();

        try
        {
            ep.method2();  // Calls method2 → method1
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handled exception in main");
        }
    }
}
