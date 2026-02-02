package com.resumeanalyzer;

import java.util.*;

public class Driver {
   public static void main(String[] args) {

        Map<String, ResumeData> map =ResumeAnalyzer.processFolder("resume");

        List<ResumeData> candidates = new ArrayList<>(map.values());

        candidates.sort((a, b) -> b.getMatchCount() - a.getMatchCount());

        System.out.println("=== Sorted Candidates ===");

        for(ResumeData r : candidates) 
        {
            System.out.println(r);
        }
    }
}
