package collegeinformationsystem;

import java.util.ArrayList;
public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    // Constructor to initialize course and assign faculty
     
    public Course(String courseName, Faculty faculty) 
    {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    //Adds a student to the course
     
    public void addStudent(Student student) 
    {
        students.add(student);
    }

    //Displays course details along with enrolled student
    public void displayCourseDetails() 
    {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students:");

        for (Student student : students) 
        {
            System.out.println("- " + student.name);
        }
    }
}
