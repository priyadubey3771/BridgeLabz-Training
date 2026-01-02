package universityCourseEnrollmentSystem;

//Abstract class representing student
abstract class Student {

 // GPA is kept private to protect internal data
 private int studentId;
 private String name;
 private double gpa;

 // Constructor for students without initial GPA
 public Student(int id, String name) 
 {
     this.studentId = id;
     this.name = name;
 }

 // Overloaded constructor for students with initial GPA
 public Student(int id, String name, double initialGpa) 
 {
     this.studentId = id;
     this.name = name;
     this.gpa = initialGpa;
 }

 // Protected setter 
 protected void setGpa(double gpa) 
 {
     this.gpa = gpa;
 }

 // Protected getter 
 protected double getGpa()
 {
     return gpa;
 }

 public void viewTranscript() 
 {
     System.out.println("Student: " + name);
     System.out.println("GPA: " + gpa);
 }

 // Abstract method 
 public abstract void displayInfo();
}