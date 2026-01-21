package com.collections.queueinterface.hospitaltriagesystem;

class Patient {

	 private String name;
	 private int severity; 
	
	 // constructor
	 public Patient(String name, int severity) 
	 {
	     this.name = name;
	     this.severity = severity;
	 }
	
	 // getters
	 public String getName() 
	 {
	     return name;
	 }
	
	 public int getSeverity() 
	 {
	     return severity;
	 }
	
	 // display patient details
	 @Override
	 public String toString() 
	 {
	     return name + " (Severity: " + severity + ")";
	 }
  }
