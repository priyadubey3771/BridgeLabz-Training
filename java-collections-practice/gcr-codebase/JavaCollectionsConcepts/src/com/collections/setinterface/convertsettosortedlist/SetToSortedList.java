package com.collections.setinterface.convertsettosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

class SetToSortedList {

    // method to convert set into sorted list, asc order
    public static List<Integer> convertAndSort(Set<Integer> set) {

        // convert set to list
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        return list;
    }
}
