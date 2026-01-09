package skillforge;

//driver class to demonstrate skillforge portal
public class SkillForgeDriver {
	public static void main(String[] args) {

        // Create instructor
        Instructor instructor = new Instructor("Neha Gupta","neha@skillforge.com");

        // Create course with custom modules
        Course course = new Course("Java Backend Development",instructor,"Advanced",new String[]{"Java Basics", "OOP", "Spring Boot", "Project"});

        instructor.uploadCourse(course);

        // Create student
        Student student = new Student("Rahul","rahul@gmail.com");

        // Student progress tracking
        student.completeModule();
        student.completeModule();

        // Progress calculation using operators
        int progress = (student.getCompletedModules() * 100) / course.getTotalModules();
        System.out.println("Course Progress: " + progress + "%");

        // Certificate generation
        if (progress >= 100) 
        {
            student.generateCertificate();
        } 
        else 
        {
            System.out.println("Complete all modules to get certificate.");
        }

        // Display course details
        System.out.println("Course Level: " + course.getLevel());
        System.out.println("Course Rating: " + course.getRating());
    }
}
