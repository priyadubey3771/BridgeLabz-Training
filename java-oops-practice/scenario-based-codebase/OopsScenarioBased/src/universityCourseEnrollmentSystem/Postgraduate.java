package universityCourseEnrollmentSystem;

class Postgraduate extends Student implements Graded {

 // Constructor with initial GPA
 public Postgraduate(int id, String name, double initialGpa) 
 {
     super(id, name, initialGpa);
 }

 //GPA calculation
 @Override
 public void assignGrade(double marks) 
 {
     double calculatedGpa = marks / 25;
     setGpa(calculatedGpa);
 }

 @Override
 public void displayInfo()
 {
     System.out.println("Postgraduate Student");
 }
}
