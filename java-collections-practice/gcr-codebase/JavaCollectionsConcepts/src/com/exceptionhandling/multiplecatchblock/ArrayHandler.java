package com.exceptionhandling.multiplecatchblock;

class ArrayHandler
{
    void getValueAtIndex(int[] arr, int index)
    {
        try
        {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e)
        {
            System.out.println("Array is not initialized!");
        }
    }
}
