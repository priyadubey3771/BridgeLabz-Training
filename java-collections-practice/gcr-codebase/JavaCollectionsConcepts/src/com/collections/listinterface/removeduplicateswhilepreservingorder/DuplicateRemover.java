package com.collections.listinterface.removeduplicateswhilepreservingorder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class DuplicateRemover {

    // removes duplicate elements while maintaining insertion order
    public static List<Integer> removeDuplicates(List<Integer> list) 
    {
    	// LinkedHashSet removes duplicates and preserves order
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        // add all elements from list to set
        uniqueElements.addAll(list);

        // convert set back to list and return
        return new ArrayList<>(uniqueElements);
    }
}
