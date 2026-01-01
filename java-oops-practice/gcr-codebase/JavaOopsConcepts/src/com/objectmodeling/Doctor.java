package com.objectmodeling;

public class Doctor {

 private String doctorName;
 private String specialization;

 // Constructor
 public Doctor(String doctorName, String specialization) 
 {
     this.doctorName = doctorName;
     this.specialization = specialization;
 }

 // Method showing communication between Doctor and Patient
 public void consult(Patient patient) 
 {
     System.out.println("Doctor " + doctorName + " (" + specialization +  ") is consulting patient " + patient.getPatientName());
 }

 // Getter
 public String getDoctorName() 
 {
     return doctorName;
 }
}
