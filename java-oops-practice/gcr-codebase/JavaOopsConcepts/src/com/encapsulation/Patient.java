package com.encapsulation;

public class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) 
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() 
    {
        return patientId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }
}
