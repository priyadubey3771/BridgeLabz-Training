package com.collections.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
class HospitalTriage {

	private PriorityQueue<Patient> queue;
	
	 // constructor
	 public HospitalTriage()
	 {
	     queue = new PriorityQueue<>(new PatientSeverityComparator());
	 }
	
	 // add patient to triage queue
	 public void admitPatient(Patient patient) 
	 {
	     queue.add(patient);
	 }
	
	 // treat patients based on priority
	 public void treatPatients() 
	 {
		 while (!queue.isEmpty()) 
		 {
	         Patient patient = queue.remove();
	         System.out.println("Treating: " + patient);
	     }
	 }
	 
}
