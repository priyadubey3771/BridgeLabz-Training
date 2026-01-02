package universityCourseEnrollmentSystem;

public class UniversityEnrollmentApp {
   public static void main(String[] args) {

        // Creating students using different constructors
        Student ugStudent = new Undergraduate(101, "Riya");
        Student pgStudent = new Postgraduate(201, "Arjun", 3.0);

        // Creating course and faculty
        Course course = new Course("CS501", "Advanced Java");
        Faculty faculty = new Faculty(1, "Dr. Mehta");

        // Enrolling students
        Enrollment e1 = new Enrollment(ugStudent, course);
        Enrollment e2 = new Enrollment(pgStudent, course);

        // Assigning grades
        faculty.assignGrade((Graded) ugStudent, 65);
        faculty.assignGrade((Graded) pgStudent, 80);

        ugStudent.viewTranscript();
        System.out.println();

        pgStudent.viewTranscript();
    }
}
