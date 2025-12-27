package com.constructor.level1;

public class CourseDriver{
  public static void main(String[] args) {

     Course course1 = new Course("Java Programming", 12, 15000.0);
     Course course2 = new Course("Web Development", 10, 12000.0);

     // Displaying course details before updating institute name
     course1.displayCourseDetails();
     System.out.println();
     course2.displayCourseDetails();
     
     System.out.println("\nUpdating Institute Name...\n");
     // Updating institute name
     Course.updateInstituteName("Tech Learning Academy");

     // Displaying course details after updating institute name
     course1.displayCourseDetails();
     System.out.println();
     course2.displayCourseDetails();
 }
}

