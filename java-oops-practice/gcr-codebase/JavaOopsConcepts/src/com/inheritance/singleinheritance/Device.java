package com.inheritance.singleinheritance;

//Superclass representing smart home device
public class Device {

 protected String deviceId;
//true = ON, false = OFF
 protected boolean status;

 // Constructor
 public Device(String deviceId, boolean status) 
 {
     this.deviceId = deviceId;
     this.status = status;
 }

 // Method to display device status
 public void displayStatus() 
 {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + (status ? "ON" : "OFF"));
 }
}
