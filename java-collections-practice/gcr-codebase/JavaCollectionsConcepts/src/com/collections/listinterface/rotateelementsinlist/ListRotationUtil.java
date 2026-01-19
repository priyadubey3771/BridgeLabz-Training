package com.collections.listinterface.rotateelementsinlist;

import java.util.ArrayList;
import java.util.List;

class ListRotationUtil {

    // Method to rotate a list to the left by k positions
    public static List<Integer> rotateLeft(List<Integer> list, int k) {

        // result list to store rotated elements
        List<Integer> rotatedList = new ArrayList<>();

        int size = list.size();

        // handle cases where k is greater than list size
        k = k % size;

        // add elements from index k to end
        for (int i = k; i < size; i++) 
        {
            rotatedList.add(list.get(i));
        }

        // add elements from index 0 to k-1
        for (int i = 0; i < k; i++) 
        {
            rotatedList.add(list.get(i));
        }

        // return rotated list
        return rotatedList;
    }
}
