package com.aidrivenresumescreeningsystem;

//data scientist role
class DataScientist extends JobRole {

 @Override
 public String getRoleName() 
 {
     return "Data Scientist";
 }

 @Override
 public int getMinimumExperience() 
 {
     return 3;
 }
 
}
