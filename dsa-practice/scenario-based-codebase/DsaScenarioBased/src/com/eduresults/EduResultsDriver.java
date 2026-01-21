package com.eduresults;

public class EduResultsDriver {
  public static void main(String[] args) {

        // district-wise sorted student data
        Student[] students = {new Student(101, "Aarav", 92), new Student(102, "Neha", 88), new Student(103, "Rahul", 88), new Student(104, "Pooja", 95),new Student(105, "Karan", 90)};

        System.out.println("Before Merging & Sorting:");
        for (Student s : students) 
        {
            s.display();
        }

        // merge Sort
        MergeSort.mergeSort(students, 0, students.length - 1);

        System.out.println("\nFinal State-wise Rank List:");
        for (Student s : students) 
        {
            s.display();
        }
        
    }
}
