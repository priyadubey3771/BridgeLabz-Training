package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

    // HashSet for fast lookup
    private Set<Policy> hashSet = new HashSet<>();

    // LinkedHashSet for insertion order
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();

    // TreeSet for sorted order by expiry date
    private Set<Policy> treeSet = new TreeSet<>(new PolicyExpiryComparator());

    // add policy to all sets
    public void addPolicy(Policy policy) 
    {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // retrieve all unique policies
    public void displayAllPolicies() 
    {
        for (Policy policy : hashSet) 
        {
            System.out.println(policy);
        }
    }

    // policies expiring within next 30 days
    public void displayExpiringSoon() 
    {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy policy : treeSet)
        {
            if (!policy.getExpiryDate().isAfter(limit)) 
            {
                System.out.println(policy);
            }
        }
    }

    // policies by coverage type
    public void displayByCoverage(String coverageType) 
    {
        for (Policy policy : hashSet) 
        {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) 
            {
                System.out.println(policy);
            }
        }
    }

    // find duplicate policies
    public void findDuplicatePolicies(List<Policy> policyList) 
    {
        Set<Integer> seen = new HashSet<>();
        for (Policy policy : policyList) 
        {
            if (!seen.add(policy.getPolicyNumber())) 
            {
                System.out.println("Duplicate Found: " + policy);
            }
        }
    }

    // performance comparison
    public void performanceTest(Policy samplePolicy) {

        long start, end;

        // HashSet
        start = System.nanoTime();
        hashSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("HashSet search time: " + (end - start) + " ns");

        // LinkedHashSet
        start = System.nanoTime();
        linkedHashSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search time: " + (end - start) + " ns");

        // TreeSet
        start = System.nanoTime();
        treeSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("TreeSet search time: " + (end - start) + " ns");
    }
}
