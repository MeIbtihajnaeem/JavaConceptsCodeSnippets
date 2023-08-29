package com.practice.oop.polymorphism.runTimePolymorphism.mostImportantOnlineShoppingSystemExample;

public class Product {

	final String name;
	final double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Product Price: " + price);

	}
}
