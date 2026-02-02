package com.medinventory;

import java.util.Objects;

public class Item<T> {

    private String itemId;
    private String itemName;
    private int quantity;
    private String expiryDate; 
    private T type;            

    public Item(String itemId, String itemName, int quantity, String expiryDate, T type) 
    {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.type = type;
    }

    public String getItemId() 
    {
        return itemId;
    }

    public String getItemName() 
    {
        return itemName;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public String getExpiryDate() 
    {
        return expiryDate;
    }

    public T getType() 
    {
        return type;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() 
    {
        return itemName + " (" + itemId + "), Qty: " + quantity + ", Expiry: " + expiryDate;
    }
}
