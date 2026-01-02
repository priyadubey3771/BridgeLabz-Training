package com.encapsulation;

public class OutPatient extends Patient {

    private double consultationFee;

    // Constructor matching the call
    public OutPatient(int patientId, String name, int age, double consultationFee) 
    {
        super(patientId, name, age);   // call parent constructor
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() 
    {
        return consultationFee;
    }
}
