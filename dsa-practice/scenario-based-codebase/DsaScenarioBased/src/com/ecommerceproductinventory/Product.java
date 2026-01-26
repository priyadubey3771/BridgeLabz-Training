package com.ecommerceproductinventory;

class Product 
{
    int sku;
    String name;
    double price;
    Product left, right;

    Product(int sku, String name, double price) 
    {
        this.sku = sku;
        this.name = name;
        this.price = price;
        left = right = null;
    }

    void display() 
    {
        System.out.println("SKU: " + sku + ", Name: " + name + ", Price: " + price);
    }
}
