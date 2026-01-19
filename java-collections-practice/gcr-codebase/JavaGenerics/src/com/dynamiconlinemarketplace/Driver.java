package com.dynamiconlinemarketplace;

//driver class
public class Driver {
  public static void main(String[] args) {

     // creating products with different categories
     Product<BookCategory> book = new Product<>("Java Programming", 500.0, new BookCategory());
     Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 1200.0, new ClothingCategory());
     Product<GadgetCategory> phone = new Product<>("Smartphone", 20000.0, new GadgetCategory());

     // applying discounts
     MarketplaceUtil.applyDiscount(book, 10);
     MarketplaceUtil.applyDiscount(shirt, 20);
     MarketplaceUtil.applyDiscount(phone, 5);
 }
}
