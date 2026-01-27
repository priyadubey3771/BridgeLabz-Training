package com.exceptionhandling.nestedtrycatchblock;

class NestedExceptionHandler
{
    void performOperation(int[] arr, int index, int divisor)
    {
        try
        {
            try
            {
                int value = arr[index];
                int result = value / divisor;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index!");
        }
    }
}
