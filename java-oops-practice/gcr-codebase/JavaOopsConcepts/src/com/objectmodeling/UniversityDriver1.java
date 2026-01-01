package com.objectmodeling;

public class UniversityDriver1 {
  public static void main(String[] args) {

     // Creating Professors
     Professor1 prof1 = new Professor1("Dr. Sharma", "Computer Science");
     Professor1 prof2 = new Professor1("Dr. Mehta", "Mathematics");

     // Creating Courses
     Course1 csCourse = new Course1("Data Structures");
     Course1 mathCourse = new Course1("Linear Algebra");

     // Assigning Professors to Courses
     prof1.assignCourse(csCourse);
     prof2.assignCourse(mathCourse);

     // Creating Students
     Student1 s1 = new Student1("Priya", 101);
     Student1 s2 = new Student1("Rahul", 102);

     // Students enroll in courses
     s1.enrollCourse(csCourse);
     s1.enrollCourse(mathCourse);
     s2.enrollCourse(csCourse);

     // Displaying details
     csCourse.displayCourseDetails();
     mathCourse.displayCourseDetails();
     s1.displayEnrolledCourses();
     s2.displayEnrolledCourses();
     prof1.displayCourses();
     prof2.displayCourses();
 }
}

