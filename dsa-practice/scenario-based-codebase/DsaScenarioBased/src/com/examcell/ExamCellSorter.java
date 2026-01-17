package com.examcell;

// handles Merge Sort for student ranking
public class ExamCellSorter {

    // merge Sort
    public static void mergeSort(Student[] students, int left, int right) 
    {
    	if (left < right) 
        {
    		int mid = (left + right) / 2;

            // sort left and right halves
            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);
            // merge sorted halves
            merge(students, left, mid, right);
            
        }
    }

    // merge two sorted halves
    private static void merge(Student[] students, int left, int mid, int right) 
    {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        // copy data
        for (int i = 0; i < n1; i++)
        {
            leftArray[i] = students[left + i];
        }

        for (int j = 0; j < n2; j++)
        {
            rightArray[j] = students[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;

        // merge by score - descending
        while (i < n1 && j < n2) 
        {

            if (leftArray[i].score >= rightArray[j].score) 
            {
                students[k++] = leftArray[i++];
            }
            else 
            {
                students[k++] = rightArray[j++];
            }
        }

        // copy remaining elements
        while (i < n1) 
        {
            students[k++] = leftArray[i++];
        }

        while (j < n2) 
        {
            students[k++] = rightArray[j++];
        }
    }
}
