package com.objectmodeling;

import java.util.ArrayList;
public class Hospital {

 private String hospitalName;
 private ArrayList<Doctor> doctors;
 private ArrayList<Patient> patients;

 // Constructor
 public Hospital(String hospitalName) 
 {
     this.hospitalName = hospitalName;
     this.doctors = new ArrayList<>();
     this.patients = new ArrayList<>();
 }

 // Add doctor to hospital
 public void addDoctor(Doctor doctor) 
 {
     doctors.add(doctor);
 }

 // Add patient to hospital
 public void addPatient(Patient patient) 
 {
     patients.add(patient);
 }

 // Display hospital details
 public void displayHospitalDetails() 
 {
     System.out.println("Hospital Name: " + hospitalName);
     System.out.println("Total Doctors : " + doctors.size());
     System.out.println("Total Patients: " + patients.size());
 }
}
