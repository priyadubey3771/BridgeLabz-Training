package com.sorting;

public class SelectionSort {
  public static void main(String[] args) {

        // Array of students exam scores
        int[] scores = {72, 85, 60, 90, 55};

        for (int i = 0; i < scores.length - 1; i++) 
        {
            int minIndex = i;

            // Finding the minimum element in remaining array
            for (int j = i + 1; j < scores.length; j++) 
            {
                if (scores[j] < scores[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // Swaping minimum element with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        // Displaying sorted exam scores
        System.out.println("Exam scores in ascending order:");
        for (int score : scores) 
        {
            System.out.print(score + " ");
        }
    }
}
