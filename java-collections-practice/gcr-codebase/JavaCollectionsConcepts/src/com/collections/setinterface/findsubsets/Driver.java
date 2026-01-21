package com.collections.setinterface.findsubsets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {
  public static void main(String[] args) {

        // creating first set, subset
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(2);
        set1.add(3);

        // creating second set, superset
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // checking subset condition
        boolean result = SubsetChecker.isSubset(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Is Set 1 a subset of Set 2? " + result);
    }
}
