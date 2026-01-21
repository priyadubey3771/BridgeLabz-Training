package com.collections.setinterface.convertsettosortedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
  public static void main(String[] args) {

        // creating a HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        // convert set to sorted list
        List<Integer> sortedList =  SetToSortedList.convertAndSort(numbers);

        System.out.println("Original Set: " + numbers);
        System.out.println("Sorted List: " + sortedList);
    }
}
