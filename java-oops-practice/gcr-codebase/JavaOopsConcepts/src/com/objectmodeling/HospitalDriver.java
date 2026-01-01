package com.objectmodeling;

public class HospitalDriver {
public static void main(String[] args) {

     // Creating Hospital
     Hospital hospital = new Hospital("City Care Hospital");

     // Creating Doctors
     Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");
     Doctor d2 = new Doctor("Dr. Mehta", "Neurology");

     // Creating Patients
     Patient p1 = new Patient("Rahul", 30);
     Patient p2 = new Patient("Anita", 25);

     // Adding doctors and patients to hospital
     hospital.addDoctor(d1);
     hospital.addDoctor(d2);
     hospital.addPatient(p1);
     hospital.addPatient(p2);

     // Displaying hospital details
     hospital.displayHospitalDetails();
     System.out.println();

     // Doctor–Patient consultations (Communication)
     d1.consult(p1);
     d1.consult(p2);
     d2.consult(p1);
 }
}
