package com.dealtracker;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        Map<String, Deal> deals = DealTracker.loadDeals("deals");

        List<Deal> sorted = new ArrayList<>(deals.values());

        sorted.sort(Comparator.comparingInt(Deal::getDiscount).reversed());

        System.out.println("=== Valid Deals ===");
        sorted.forEach(System.out::println);
    }
}
