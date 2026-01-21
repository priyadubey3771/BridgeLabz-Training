package com.insurancepolicymanagementsystem2;

import java.time.LocalDate;
import java.util.*;

// handles storage and retrieval of policies
public class PolicyManager {

    // HashMap
    private Map<String, Policy> policyHashMap = new HashMap<>();

    // LinkedHashMap for insertion order
    private Map<String, Policy> policyLinkedMap = new LinkedHashMap<>();

    // TreeMap for sorted by expiry date
    private TreeMap<LocalDate, List<Policy>> policyTreeMap = new TreeMap<>();

    // add policy to all maps
    public void addPolicy(Policy policy) 
    {
    	policyHashMap.put(policy.getPolicyNumber(), policy);
        policyLinkedMap.put(policy.getPolicyNumber(), policy);

        // store policies sorted by expiry date
        policyTreeMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
        
    }

    // Retrieve policy by policy number
    public Policy getPolicyByNumber(String policyNumber) 
    {
        return policyHashMap.get(policyNumber);
    }

    // list policies expiring within next 30 days
    public List<Policy> getPoliciesExpiringSoon() 
    {

        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : policyTreeMap.entrySet()) 
        {
            if (!entry.getKey().isAfter(limit)) 
            {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }

    // List policies by policy holder name
    public List<Policy> getPoliciesByHolder(String holderName) 
    {
    	List<Policy> result = new ArrayList<>();

        for (Policy policy : policyHashMap.values()) 
        {
            if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) 
            {
                result.add(policy);
            }
        }
        return result;
    }

    // remove expired policies
    public void removeExpiredPolicies() 
    {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyHashMap.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) 
            {
                iterator.remove();
                policyLinkedMap.remove(policy.getPolicyNumber());
            }
        }

        // remove from TreeMap
        policyTreeMap.headMap(today).clear();
    }

    // display all policies 
    public void displayAllPolicies() 
    {
        policyLinkedMap.values().forEach(System.out::println);
    }
    
}
