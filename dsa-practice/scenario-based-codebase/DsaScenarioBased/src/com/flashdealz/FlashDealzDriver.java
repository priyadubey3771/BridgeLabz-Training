package com.flashdealz;

public class FlashDealzDriver {
  public static void main(String[] args) {

        Product[] products = {new Product(201, "Laptop", 35), new Product(202, "Smartphone", 50),new Product(203, "Headphones", 25),new Product(204, "Smart Watch", 40),new Product(205, "Camera", 30)};

        System.out.println("Before Sorting (Unsorted Discounts):");
        for (Product p : products) 
        {
            p.display();
        }

        QuickSort.quickSort(products, 0, products.length - 1);

        System.out.println("\nTop Discounted Products:");
        for (Product p : products) 
        {
            p.display();
        }
        
    }
}
