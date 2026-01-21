package com.insurancepolicymanagementsystem2;

import java.time.LocalDate;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // Add policies
        manager.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new Policy("P102", "Bob",LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new Policy("P103", "Alice",LocalDate.now().minusDays(5), "Home", 6000));
        manager.addPolicy(new Policy("P104", "Carol",LocalDate.now().plusDays(20), "Health", 5500));
        
        // retrieve by policy number
        System.out.println("Policy P101:");
        System.out.println(manager.getPolicyByNumber("P101"));

        // policies expiring in next 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        List<Policy> expiringSoon = manager.getPoliciesExpiringSoon();
        expiringSoon.forEach(System.out::println);

        // policies for a specific policy holder
        System.out.println("\nPolicies for Alice:");
        manager.getPoliciesByHolder("Alice").forEach(System.out::println);

        // remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nPolicies after removing expired ones:");
        manager.displayAllPolicies();
        
    }
}
