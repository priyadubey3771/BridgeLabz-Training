package collegeinformationsystem;

// Interface defining actions related to courses.
  public interface ICourseActions 
  {

    // Method to enroll in a course
    void enrollCourse(Course course);

    // Method to drop a course
    void dropCourse(Course course);
  }
