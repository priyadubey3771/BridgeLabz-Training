package com.collections.setinterface.unionandintersectionoftwosets;

import java.util.HashSet;
import java.util.Set;

public class Driver {
  public static void main(String[] args) {

        // creating first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // finding union and intersection
        Set<Integer> union =  SetOperations.findUnion(set1, set2);

        Set<Integer> intersection = SetOperations.findIntersection(set1, set2);

        // display results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
