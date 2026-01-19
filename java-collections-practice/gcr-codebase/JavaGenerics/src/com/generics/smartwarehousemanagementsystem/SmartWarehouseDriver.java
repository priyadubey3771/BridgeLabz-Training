package com.generics.smartwarehousemanagementsystem;

public class SmartWarehouseDriver {
 public static void main(String[] args) {

	        Storage<Electronics> electronicsStorage = new Storage<>();
	        electronicsStorage.addItem(new Electronics("Laptop", 10));
	        electronicsStorage.addItem(new Electronics("Mobile", 25));

	        Storage<Groceries> groceriesStorage = new Storage<>();
	        groceriesStorage.addItem(new Groceries("Rice", 50));
	        groceriesStorage.addItem(new Groceries("Wheat", 40));

	        Storage<Furniture> furnitureStorage = new Storage<>();
	        furnitureStorage.addItem(new Furniture("Chair", 15));
	        furnitureStorage.addItem(new Furniture("Table", 5));

	        System.out.println("---- Electronics ----");
	        WarehouseUtil.displayItems(electronicsStorage.getItems());

	        System.out.println("\n---- Groceries ----");
	        WarehouseUtil.displayItems(groceriesStorage.getItems());

	        System.out.println("\n---- Furniture ----");
	        WarehouseUtil.displayItems(furnitureStorage.getItems());
	    }
	}

	
	

