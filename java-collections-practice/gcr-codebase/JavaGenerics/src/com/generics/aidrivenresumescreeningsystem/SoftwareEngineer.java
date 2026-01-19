package com.generics.aidrivenresumescreeningsystem;

//software engineer role
class SoftwareEngineer extends JobRole {

 @Override
 public String getRoleName() 
 {
     return "Software Engineer";
 }

 @Override
 public int getMinimumExperience() 
 {
     return 2;
 }
 
}
