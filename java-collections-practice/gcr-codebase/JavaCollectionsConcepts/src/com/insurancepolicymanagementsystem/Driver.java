package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
 public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // creating policies
        Policy p1 = new Policy(101, "Alice", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Bob",LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(103, "Charlie",LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy(101, "Alice Duplicate", LocalDate.now().plusDays(10), "Health", 5000);

        // adding policies
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);

        // display all policies
        System.out.println("\nAll Unique Policies:");
        manager.displayAllPolicies();

        // policies expiring soon
        System.out.println("\nPolicies Expiring Within 30 Days:");
        manager.displayExpiringSoon();

        // policies by coverage type
        System.out.println("\nHealth Insurance Policies:");
        manager.displayByCoverage("Health");

        // duplicate detection
        List<Policy> policyList = new ArrayList<>();
        policyList.add(p1);
        policyList.add(p2);
        policyList.add(p4);

        System.out.println("\nDuplicate Policies:");
        manager.findDuplicatePolicies(policyList);

        // performance comparison
        System.out.println("\nPerformance Comparison:");
        manager.performanceTest(p1);
    }
}
