package com.collections.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // creating an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // creating a LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // reversing ArrayList
        List<Integer> reversedArrayList = ListReverseUtil.reverseArrayList(arrayList);

        // reversing LinkedList
        List<Integer> reversedLinkedList = ListReverseUtil.reverseLinkedList(linkedList);

        // display results
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);
        System.out.println();
        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
        
    }
}
