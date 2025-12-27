package com.constructor.level1;

public class StudentDriver {
  public static void main(String[] args) {

     PostgraduateStudent student = new PostgraduateStudent(101, "Priya Dubey", 8.6, "Computer Science");

     // Displaying student details
     student.displayDetails();
     
     System.out.println("\nUpdating CGPA...\n");

     // Modifying CGPA using public setter method
     student.setCgpa(8.9);
     
     // Displaying updated details
     student.displayDetails();
  }
}
