package com.practice.oop.polymorphism.runTimePolymorphism.onlineShoppingSystemExample;

public class Clothing extends Product {
	final double weight;

	Clothing(String name, double price, double weight) {
		super(name, price);
		this.weight = weight;
	}
	
	public void applyDiscount() {
		System.out.println("Discount is applied");
	}
	public void displayDetails() {
		System.out.println("Clothing Name: " + name);
		System.out.println("Clothing Price: " + price);
		System.out.println("Clothing weight: " + weight);

	}

}
