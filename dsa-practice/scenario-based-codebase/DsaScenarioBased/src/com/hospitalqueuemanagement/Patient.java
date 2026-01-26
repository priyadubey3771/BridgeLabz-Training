package com.hospitalqueuemanagement;

class Patient
{
    int checkInTime;
    String name;
    int height;
    Patient left, right;

    Patient(int checkInTime, String name)
    {
        this.checkInTime = checkInTime;
        this.name = name;
        this.height = 1;
        left = right = null;
    }

    void display()
    {
        System.out.println("Time: " + checkInTime + " | Patient: " + name);
    }
}
