package com.flashdealz;

class Product {
	
    int productId;
    String name;
    int discount;

    Product(int productId, String name, int discount) 
    {
        this.productId = productId;
        this.name = name;
        this.discount = discount;
    }

    void display() 
    {
        System.out.println(productId + "  " + name + "  " + discount + "%");
    }
    
}
