package com.designvotingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {

    // fast vote counting
    private Map<String, Integer> voteCountMap = new HashMap<>();

    // maintains order of votes
    private Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    // cast votes
    public void castVote(Vote vote) 
    {
    	String candidate = vote.getCandidateName();

        // count votes
        voteCountMap.put(candidate,voteCountMap.getOrDefault(candidate, 0) + 1);

        // preserve insertion order
        insertionOrderMap.put(candidate,insertionOrderMap.getOrDefault(candidate, 0) + 1);
    }

    // displaying results in sorted order 
    public void displaySortedResults() 
    {
    	TreeMap<String, Integer> sortedMap = new TreeMap<>(voteCountMap);

        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }

    // displaying results in insertion order
    public void displayInsertionOrderResults() 
    {
    	System.out.println("\nVoting Results (Insertion Order):");
        for (Map.Entry<String, Integer> entry : insertionOrderMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
