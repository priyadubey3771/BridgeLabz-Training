package com.multileveluniversitycoursemanagementsystem;

import java.util.List;

//utility class for university operations
class UniversityUtil {

 // wildcard method to display any type of course
 public static void displayCourses(List<? extends CourseType> courseTypes) 
 {
     
	 for (CourseType type : courseTypes) 
     {
         System.out.println("Evaluation Method: " + type.getEvaluationType());
     }

 }
}
