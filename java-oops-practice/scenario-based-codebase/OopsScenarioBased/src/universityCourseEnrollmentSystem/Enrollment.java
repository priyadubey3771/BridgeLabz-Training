package universityCourseEnrollmentSystem;

class Enrollment {

 private Student student;
 private Course course;

 // Constructor
 public Enrollment(Student student, Course course) 
 {
     this.student = student;
     this.course = course;
 }

 // Display enrollment details
 public void showEnrollment() 
 {
     student.displayInfo();
     course.displayCourse();
 }
}
