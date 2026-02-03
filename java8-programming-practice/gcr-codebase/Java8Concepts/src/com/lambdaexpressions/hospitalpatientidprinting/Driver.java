package com.lambdaexpressions.hospitalpatientidprinting;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
    	
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("P001", "Alice"));
        patients.add(new Patient("P002", "Bob"));
        patients.add(new Patient("P003", "Charlie"));

        System.out.println("Patient IDs:");

        // Using method reference to print each patient ID
        patients.stream().map(Patient::getId).forEach(System.out::println); 
        
    }
}
