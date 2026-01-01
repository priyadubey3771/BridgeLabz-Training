package com.objectmodeling;

public class ECommerceDriver {
  public static void main(String[] args) {

     // Creating products
     Product p1 = new Product("Laptop", 55000);
     Product p2 = new Product("Headphones", 2000);
     Product p3 = new Product("Mouse", 800);

     // Creating order
     Order order1 = new Order(101);

     // Adding products to order
     order1.addProduct(p1);
     order1.addProduct(p2);
     order1.addProduct(p3);

     // Creating customer
     Customer1 customer = new Customer1("Priya");

     // Customer places order
     customer.placeOrder(order1);
 }
}

