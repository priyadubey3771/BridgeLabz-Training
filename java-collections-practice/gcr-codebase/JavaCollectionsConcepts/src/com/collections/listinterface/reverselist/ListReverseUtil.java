package com.collections.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// utility class containing custom reverse logic
class ListReverseUtil {

    // method to reverse an ArrayList without using built-in methods
    public static List<Integer> reverseArrayList(List<Integer> list) 
    {

        //create a new list to store reversed elements
        List<Integer> reversedList = new ArrayList<>();

        // traverse original list from last index to first
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            reversedList.add(list.get(i));
        }

        // return the reversed list
        return reversedList;
    }

    // method to reverse a LinkedList without using built-in methods
    public static List<Integer> reverseLinkedList(List<Integer> list) 
    {
    	// create a new LinkedList to store reversed elements
        List<Integer> reversedList = new LinkedList<>();

        // traverse original list from last index to first
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            reversedList.add(list.get(i));
        }

        // return the reversed list
        return reversedList;
    }
}
