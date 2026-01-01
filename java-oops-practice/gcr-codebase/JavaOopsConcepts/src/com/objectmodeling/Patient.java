package com.objectmodeling;

public class Patient {

 private String patientName;
 private int age ;

 // Constructor
 public Patient(String patientName, int age) 
 {
     this.patientName = patientName;
     this.age = age;
 }

 // Getter
 public String getPatientName() 
 {
     return patientName;
 }
}
