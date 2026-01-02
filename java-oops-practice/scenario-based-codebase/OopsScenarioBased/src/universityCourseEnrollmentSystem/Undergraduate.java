package universityCourseEnrollmentSystem;

//Inheritance
class Undergraduate extends Student implements Graded {

 // Constructor
 public Undergraduate(int id, String name) 
 {
     super(id, name);
 }

 // Pass/Fail grading system
 @Override
 public void assignGrade(double marks) 
 {
    if (marks >= 50) 
    {
         setGpa(2.0);   
    } 
    else 
    {
         setGpa(0.0);  
    }
 }

 @Override
 public void displayInfo() 
 {
     System.out.println("Undergraduate Student");
 }
}
