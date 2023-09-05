package com.practice.oop.lambdaExpressions.shopping_cart_example;

public class Item {

	private final String name;
	private final double price;

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
