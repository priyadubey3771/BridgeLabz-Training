package com.generics.aidrivenresumescreeningsystem;

import java.util.List;

//utility class for resume screening operations
class ResumeScreeningUtil {

 // generic method to screen a single resume
  public static <T extends JobRole> void screenResume(Resume<T> resume) {

     // Checking experience eligibility
     if (resume.getYearsOfExperience() >= resume.getJobRole().getMinimumExperience()) 
     {

         System.out.println( resume.getCandidateName() + " is eligible for " + resume.getJobRole().getRoleName());
     } 
     else 
     {
         System.out.println( resume.getCandidateName() + " is NOT eligible for " +resume.getJobRole().getRoleName());
     }
 }

 // wildcard method to process multiple job roles dynamically
 public static void processJobRoles(List<? extends JobRole> roles) 
 {

     for (JobRole role : roles) 
     {
         System.out.println("Screening resumes for role: " +role.getRoleName());
     }

  
  }
 
}
