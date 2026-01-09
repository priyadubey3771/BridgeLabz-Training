package skillforge;

//represents an instructor user
public class Instructor extends User {

    public Instructor(String name, String email) 
    {
        super(name, email);
    }

    // Upload a course
    public void uploadCourse(Course course) 
    {
        System.out.println(name + " uploaded course: " + course.getTitle());
    }
}
