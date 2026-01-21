package com.collections.queueinterface.hospitaltriagesystem;

import java.util.Comparator;

//comparator to prioritize patients with higher severity
class PatientSeverityComparator implements Comparator<Patient> {
	
	 @Override
	 public int compare(Patient p1, Patient p2) 
	 {
		 // higher severity should come first
	     return Integer.compare(p2.getSeverity(), p1.getSeverity());
	     
	 }
}
