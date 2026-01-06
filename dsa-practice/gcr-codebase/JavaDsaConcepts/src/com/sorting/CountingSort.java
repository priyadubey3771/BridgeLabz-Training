package com.sorting;

public class CountingSort {
  public static void main(String[] args) {

        // Array of student ages
        int[] ages = {12, 15, 10, 14, 18, 11, 15, 13};

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        //Creating count array
        int[] count = new int[range];

        //Storing frequency of each age
        for (int age : ages) 
        {
            count[age - minAge]++;
        }

        //Computing cumulative count
        for (int i = 1; i < count.length; i++) 
        {
            count[i] = count[i] + count[i - 1];
        }

        //Creating output array
        int[] output = new int[ages.length];

        // Placing elements in correct position
        for (int i = ages.length - 1; i >= 0; i--)
        {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Copying sorted values back
        for (int i = 0; i < ages.length; i++) 
        {
            ages[i] = output[i];
        }

        // Displaying sorted ages
        System.out.println("Student ages in ascending order:");
        for (int age : ages)
        {
            System.out.print(age + " ");
        }
    }
}

