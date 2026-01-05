package collegeinformationsystem;

import java.util.ArrayList;
public class Student extends Person implements ICourseActions {

    // List of courses enrolled by the student
    private ArrayList<Course> courses;

    // Grades are private to protect sensitive academic data
    private int[] grades;

    //Constructor to initialize student details and grades
       public Student(int id, String name, String email, int[] grades) 
       {
	        super(id, name, email);
	        this.grades = grades;
	        this.courses = new ArrayList<>();
       }

      //Calculates GPA using arithmetic operators
        public double calculateGPA() 
    {
        int sum = 0;

        for (int grade : grades) 
        {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    // Enroll student into a course
     @Override
    public void enrollCourse(Course course) 
    {
        courses.add(course);
        course.addStudent(this);
    }

    // Drops a course
    @Override
    public void dropCourse(Course course) 
    {
        courses.remove(course);
    }
     
    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
