package com.objectmodeling;

public class SchoolAssociationDriver {
  public static void main(String[] args) {

     // Creating School
     School school = new School("Green Valley School");

     // Creating Students (Independent objects)
     Student s1 = new Student("Priya Dubey");
     Student s2 = new Student("Amit Sharma");

     // Creating Courses
     Course math = new Course("Mathematics");
     Course science = new Course("Science");

     // Aggregation, adding students to school
     school.addStudent(s1);
     school.addStudent(s2);

     // Association, students enrolling in courses
     s1.enrollCourse(math);
     s1.enrollCourse(science);
     s2.enrollCourse(science);

     // Display details
     school.displaySchoolStudents();
     s1.displayEnrolledCourses();
     s2.displayEnrolledCourses();
     math.displayEnrolledStudents();
     science.displayEnrolledStudents();
 }
}

