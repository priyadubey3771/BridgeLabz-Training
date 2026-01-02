package universityCourseEnrollmentSystem;

class Course {

 private String courseCode;
 private String courseName;

 // Constructor
 public Course(String code, String name) 
 {
     this.courseCode = code;
     this.courseName = name;
 }

 // Method to display course details
 public void displayCourse() 
 {
     System.out.println(courseCode + " - " + courseName);
 }
}
