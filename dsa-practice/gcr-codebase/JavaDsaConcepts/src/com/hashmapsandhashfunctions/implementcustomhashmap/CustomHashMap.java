package com.hashmapsandhashfunctions.implementcustomhashmap;

import java.util.LinkedList;
public class CustomHashMap {

    private class Node 
    {
        int key;
        int value;

        Node(int key, int value) 
        {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] buckets;
    private int bucketSize;

    @SuppressWarnings("unchecked")
    public CustomHashMap(int size) 
    {
        bucketSize = size;
        buckets = new LinkedList[bucketSize];
        for (int i = 0; i < bucketSize; i++) 
        {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getHash(int key) 
    {
        return key % bucketSize;
    }

    // Insert or update key-value
    public void put(int key, int value) 
    {
        int index = getHash(key);
        for (Node node : buckets[index]) 
        {
            if (node.key == key) 
            {
            	// Update existing key
                node.value = value; 
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    // Retrieve value by key
    public Integer get(int key) 
    {
        int index = getHash(key);
        for (Node node : buckets[index]) 
        {
            if (node.key == key) 
            {
                return node.value;
            }
        }
        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) 
    {
        int index = getHash(key);
        Node toRemove = null;
        for (Node node : buckets[index])
        {
            if (node.key == key) 
            {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) 
        {
            buckets[index].remove(toRemove);
        }
    }
}
