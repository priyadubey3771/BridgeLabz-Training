package com.sorting;

public class BubbleSort {
  public static void main(String[] args) {

        // Array of student marks
        int[] marks = {78, 45, 89, 62, 50};

        // Bubble Sort logic
        for (int i = 0; i < marks.length - 1; i++) 
        {
            for (int j = 0; j < marks.length - 1 - i; j++) 
            {

                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) 
                {

                    // Swap using temp variable
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        // Printing sorted marks
        System.out.println("Student marks in ascending order:");
        for (int mark : marks) 
        {
            System.out.print(mark + " ");
        }
    }
}
