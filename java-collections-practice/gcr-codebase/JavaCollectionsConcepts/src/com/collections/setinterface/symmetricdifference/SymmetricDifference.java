package com.collections.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

class SymmetricDifference {

    // method to find symmetric difference of two sets
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) 
    {
        // creating copies to avoid modifying original sets
        Set<Integer> difference1 = new HashSet<>(set1);
        Set<Integer> difference2 = new HashSet<>(set2);

        // remove common elements from both sets
        difference1.removeAll(set2);
        difference2.removeAll(set1);

        // combine remaining elements
        difference1.addAll(difference2);

        return difference1;
    }
}
