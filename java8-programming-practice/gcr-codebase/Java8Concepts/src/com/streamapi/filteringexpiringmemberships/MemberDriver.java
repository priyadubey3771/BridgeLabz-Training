package com.streamapi.filteringexpiringmemberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class MemberDriver {
   public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Priya", LocalDate.now().plusDays(40)),
            new Member("Rahul", LocalDate.now().plusDays(25)),
            new Member("Sneha", LocalDate.now().plusDays(5)),
            new Member("Karan", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()

            // Filter members whose expiry is within next 30 days
            .filter(member ->!member.getExpiryDate().isBefore(today) &&!member.getExpiryDate().isAfter(next30Days))
            .collect(Collectors.toList());

        System.out.println("Members with Membership Expiring in Next 30 Days:");
        expiringSoon.forEach(System.out::println);
    }
}
