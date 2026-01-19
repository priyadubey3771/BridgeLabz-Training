package com.generics.aidrivenresumescreeningsystem;

//generic Resume class
class Resume<T extends JobRole> {

 // candidate details
 private String candidateName;
 private int yearsOfExperience;
 private T jobRole;

 // constructor 
 public Resume(String candidateName, int yearsOfExperience, T jobRole) 
 {
     this.candidateName = candidateName;
     this.yearsOfExperience = yearsOfExperience;
     this.jobRole = jobRole;
 }

 // getter for candidate name
 public String getCandidateName() 
 {
     return candidateName;
 }

 // getter for experience
 public int getYearsOfExperience() 
 {
     return yearsOfExperience;
 }

 // getter for job role
 public T getJobRole() 
 {
     return jobRole;
 }
}
