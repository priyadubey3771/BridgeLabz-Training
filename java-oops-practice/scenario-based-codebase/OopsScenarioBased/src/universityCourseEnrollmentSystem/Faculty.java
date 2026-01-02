package universityCourseEnrollmentSystem;

class Faculty {

 private int facultyId;
 private String name;

 // Constructor
 public Faculty(int id, String name) 
 {
     this.facultyId = id;
     this.name = name;
 }

 // Faculty can assign grades to any Graded student
 public void assignGrade(Graded student, double marks) 
 {
     student.assignGrade(marks);
 }
}
