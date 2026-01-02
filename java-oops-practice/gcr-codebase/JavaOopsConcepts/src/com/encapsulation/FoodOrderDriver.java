package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderDriver {
  public static void main(String[] args) {

        //FoodItem reference
        List<FoodItem> orderItems = new ArrayList<>();

        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : orderItems) 
        {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            // Interface-based polymorphism
            if (item instanceof Discountable) 
            {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
                System.out.println("Discount     : " + discountable.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;

            System.out.println("Total Price  : " + totalPrice);
            System.out.println("Final Price  : " + finalPrice);
            System.out.println("--------------------------------");
        }
    }
}
