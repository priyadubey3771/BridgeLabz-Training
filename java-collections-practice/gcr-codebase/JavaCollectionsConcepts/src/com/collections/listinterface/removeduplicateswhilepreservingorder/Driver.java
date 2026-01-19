package com.collections.listinterface.removeduplicateswhilepreservingorder;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // input list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //duplicate removal 
        List<Integer> result = DuplicateRemover.removeDuplicates(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("After Removing Duplicates: " + result);
        
    }
}
