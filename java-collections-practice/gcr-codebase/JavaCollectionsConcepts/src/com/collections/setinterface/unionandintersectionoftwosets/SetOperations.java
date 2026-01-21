package com.collections.setinterface.unionandintersectionoftwosets;

import java.util.HashSet;
import java.util.Set;

class SetOperations {

    // method to compute union of two sets
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) 
    {
    	// create a new set to avoid modifying original sets
        Set<Integer> unionSet = new HashSet<>(set1);

        // add all elements from second set
        unionSet.addAll(set2);

        return unionSet;
    }

    // method to compute intersection of two sets
    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) 
    {
    	// create a new set to avoid modifying original sets
        Set<Integer> intersectionSet = new HashSet<>(set1);

        // retain only common elements
        intersectionSet.retainAll(set2);

        return intersectionSet;
    }
}
