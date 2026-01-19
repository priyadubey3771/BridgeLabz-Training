package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // creating different courses with different evaluation types
        Course<ExamCourse> math = new Course<>("Mathematics", "Science", new ExamCourse());
        Course<AssignmentCourse> cs =  new Course<>("Data Structures", "Computer Science", new AssignmentCourse());
        Course<ResearchCourse> phd = new Course<>("AI Research", "Computer Science", new ResearchCourse());

        // creating list of course types
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(math.getCourseType());
        courseTypes.add(cs.getCourseType());
        courseTypes.add(phd.getCourseType());

        // displaying all evaluation types dynamically
        UniversityUtil.displayCourses(courseTypes);
    }
}
