package com.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// generic storage class that can store any type of WarehouseItem
class Storage<T extends WarehouseItem> {

    // list to store items of a specific WarehouseItem type
    private List<T> items = new ArrayList<>();

    // method to add an item to storage
    public void addItem(T item)
    {
        items.add(item);
    }

    // returns the list of stored items
    public List<T> getItems() 
    {
        return items;
    }
}
