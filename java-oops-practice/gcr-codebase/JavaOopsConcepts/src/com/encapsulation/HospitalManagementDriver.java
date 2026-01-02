package com.encapsulation;

public class HospitalManagementDriver {
    public static void main(String[] args) {

        Patient p = new OutPatient(101, "Ravi", 25, 500.0);

        System.out.println("Patient ID: " + p.getPatientId());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
