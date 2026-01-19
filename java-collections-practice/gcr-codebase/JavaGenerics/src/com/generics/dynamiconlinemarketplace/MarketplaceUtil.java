package com.generics.dynamiconlinemarketplace;

//utility class for marketplace operations
class MarketplaceUtil {
	
// generic method to apply discount to any product, T must be a product
 public static <T extends Product<?>> void applyDiscount( T product, double percentage) 
 {
     // calculate discount amount
     double discountAmount = product.getPrice() * (percentage / 100);

     // update product price
     double newPrice = product.getPrice() - discountAmount;
     product.setPrice(newPrice);

     // display result
     System.out.println("Discount applied to " + product.getName() + " | New Price: " + newPrice);
 }
}
