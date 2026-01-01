package com.inheritance.multilevelinheritance;

public class CourseDriver {
   public static void main(String[] args) {

        Course course1 = new Course("OOPS Basics", 40);
        Course course2 = new OnlineCourse("Java Online", 60, "Coursera", true);
        Course course3 = new PaidOnlineCourse("Advanced Java", 80, "Udemy", true, 5000, 20);

        Course[] courses = { course1, course2, course3 };

        for (Course course : courses) 
        {
            System.out.println("------------------------");
            course.displayCourseDetails();
        }
    }
}
