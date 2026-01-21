package com.collections.queueinterface.hospitaltriagesystem;

public class Driver {
  public static void main(String[] args) {

     HospitalTriage triage = new HospitalTriage();

     // adding patients
     triage.admitPatient(new Patient("John", 3));
     triage.admitPatient(new Patient("Alice", 5));
     triage.admitPatient(new Patient("Bob", 2));

     // treat patients in priority order
     System.out.println("Treatment Order:");
     triage.treatPatients();
     
 }
}
