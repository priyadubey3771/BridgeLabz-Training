package com.collections.setinterface.checkiftwosetsareequal;

import java.util.Set;

//class responsible for comparing two sets
public class SetComparator {

 // method to check if two sets contain the same elements
 public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) 
 {
	 // if sizes are different, sets cannot be equal
     if (set1.size() != set2.size()) 
     {
         return false;
     }

     //checks whether all elements of one set exist in the other
     return set1.containsAll(set2);
 }
}
