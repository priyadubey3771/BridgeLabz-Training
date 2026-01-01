package com.inheritance.multilevelinheritance;

public class OnlineCourse extends Course {

 protected String platform;
 protected boolean isRecorded;

 // Constructor
 public OnlineCourse(String courseName, int duration,String platform, boolean isRecorded) 
 {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 public void displayCourseDetails() 
 {
     super.displayCourseDetails();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}
