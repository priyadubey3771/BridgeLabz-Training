package com.medinventory;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MedInventory {

    private static final String EXPIRY_REGEX = "\\b(\\d{2}-\\d{2}-\\d{4})\\b";
    private static final int CRITICAL_QTY = 5;

    public static <T> Map<String, List<Item<T>>> processInventory(String filePath, T type) throws IOException {

        Map<String, List<Item<T>>> categorized = new HashMap<>();
        Set<Item<T>> uniqueItems = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate today = LocalDate.now();

        while ((line = br.readLine()) != null) {
            try {
                String[] parts = line.split(",");
                if (parts.length != 4)
                    throw new IllegalArgumentException("Invalid line format");

                String itemId = parts[0].trim();
                String itemName = parts[1].trim();
                int quantity = Integer.parseInt(parts[2].trim());
                String expiry = parts[3].trim();

                // Regex check for expiry date
                if (!Pattern.matches(EXPIRY_REGEX, expiry))
                    throw new IllegalArgumentException("Invalid expiry date format");

                Item<T> item = new Item<>(itemId, itemName, quantity, expiry, type);

                // Skip duplicate
                if (!uniqueItems.add(item)) continue;

                // Check expiry
                LocalDate expDate = LocalDate.parse(expiry, formatter);
                if (expDate.isBefore(today)) {
                    System.out.println("Expired: " + item);
                    continue;
                }

                // Check critical stock
                if (quantity < CRITICAL_QTY) {
                    throw new LowStockException("Critical stock for " + itemName + ": " + quantity);
                }

                // Categorize by type
                categorized.computeIfAbsent(type.toString(), k -> new ArrayList<>()).add(item);

            } catch (LowStockException e) {
                System.out.println("Warning: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Skipping line: " + line + " -> " + e.getMessage());
            }
        }

        br.close();
        return categorized;
    }
}
