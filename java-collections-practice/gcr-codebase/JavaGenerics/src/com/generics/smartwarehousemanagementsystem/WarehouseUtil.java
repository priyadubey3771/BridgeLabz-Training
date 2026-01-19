package com.generics.smartwarehousemanagementsystem;

import java.util.List;

//Utility class for warehouse-related operations
class WarehouseUtil {

 // Wildcard method extends WarehouseItem
 public static void displayItems(List<? extends WarehouseItem> items) {

     // Enhanced for loop to read items safely
     for (WarehouseItem item : items) 
     {
         System.out.println(item.getCategory() + " | " +item.getName() + " | Quantity: " +item.getQuantity());
     }
 }
}
