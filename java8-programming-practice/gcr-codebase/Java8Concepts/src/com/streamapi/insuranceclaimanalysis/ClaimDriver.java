package com.streamapi.insuranceclaimanalysis;

import java.util.*;
import java.util.stream.*;

public class ClaimDriver {
  public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Vehicle", 12000),
            new Claim("Health", 8000),
            new Claim("Property", 20000),
            new Claim("Vehicle", 15000),
            new Claim("Health", 7000),
            new Claim("Property", 25000)
        );

        Map<String, Double> averageClaimByType = claims.stream()

            // Group by claim type and calculate average amount
            .collect(Collectors.groupingBy(Claim::getClaimType,Collectors.averagingDouble(Claim::getAmount)));

        System.out.println("Average Claim Amount by Type:");
        
        averageClaimByType.forEach((type, avg) ->System.out.println(type + " -> " + avg));
        
    }
}
