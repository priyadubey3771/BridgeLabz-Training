package com.encapsulation;

public class InPatient extends Patient {

    private int numberOfDays;

    public InPatient(int patientId, String name, int age, int numberOfDays) 
    {
        super(patientId, name, age);   
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays()
    {
        return numberOfDays;
    }
}
