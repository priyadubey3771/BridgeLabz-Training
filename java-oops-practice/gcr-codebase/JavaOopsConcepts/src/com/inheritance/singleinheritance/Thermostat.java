package com.inheritance.singleinheritance;

public class Thermostat extends Device {

 private double temperatureSetting;

 // Constructor
 public Thermostat(String deviceId, boolean status, double temperatureSetting) 
 {
	// call superclass constructor
     super(deviceId, status); 
     this.temperatureSetting = temperatureSetting;
 }

 // Overriding method to include thermostat-specific details
 @Override
 public void displayStatus() 
 {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + " °C");
 }
}

