package collegeinformationsystem;

public class CampusConnectDriver {
   public static void main(String[] args) {

        // Creating a faculty object
        Faculty faculty = new Faculty(201, "Dr. Sharma", "sharma@university.edu", "Computer Science");

        // Creating a course and assigning faculty
        Course course = new Course("Java Programming", faculty);

        // Grades for students
        int[] grades1 = {85, 90, 88};
        int[] grades2 = {78, 82, 80};

        // Creating student objects
        Student student1 = new Student(101, "Amit", "amit@student.edu", grades1);
        Student student2 = new Student(102, "Neha", "neha@student.edu", grades2 );

        // Students enrolling in course
        student1.enrollCourse(course);
        student2.enrollCourse(course);

        // Person reference holding Student and Faculty objects
         
        Person[] people = { student1, student2, faculty };

        for (Person person : people) 
        {
            person.printDetails();
            System.out.println("-------------------");
        }

        // Display course information
        course.displayCourseDetails();
    }
}
