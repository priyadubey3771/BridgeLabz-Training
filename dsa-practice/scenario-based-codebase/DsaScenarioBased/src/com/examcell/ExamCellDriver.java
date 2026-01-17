package com.examcell;

public class ExamCellDriver {
   public static void main(String[] args) {

        Student[] students = {new Student("S101", "Aarav", 78),new Student("S102", "Diya", 92),new Student("S103", "Kabir", 85), new Student("S104", "Meera", 92), new Student("S105", "Rohan", 67)};

        System.out.println("Before Sorting:");
        for (Student s : students) 
        {
            s.display();
        }

        ExamCellSorter.mergeSort(students, 0, students.length - 1);
        System.out.println("\nState-Level Rank List:");
        int rank = 1;
        for (Student s : students) 
        {
            System.out.print("Rank " + rank++ + ": ");
            s.display();
        }
    }
}

