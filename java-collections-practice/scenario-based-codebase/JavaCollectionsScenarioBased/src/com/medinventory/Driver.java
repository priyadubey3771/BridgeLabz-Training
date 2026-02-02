package com.medinventory;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        Map<String, List<Item<String>>> inventory =
                MedInventory.processInventory("medinventory.csv", "Medicine");

        System.out.println("\n=== Current Inventory ===");
        for (List<Item<String>> items : inventory.values()) {
            for (Item<String> item : items) {
                System.out.println(item);
            }
        }
    }
}
