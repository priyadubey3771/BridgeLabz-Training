package com.collections.setinterface.convertsettosortedlist;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Driver {
  public static void main(String[] args) {

        // creating a HashSet
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        // convert set to sorted list
        List<Integer> sortedList =  SetToSortedList.convertAndSort(numbers);

        System.out.println("Original Set: " + numbers);
        System.out.println("Sorted List: " + sortedList);
    }
}
