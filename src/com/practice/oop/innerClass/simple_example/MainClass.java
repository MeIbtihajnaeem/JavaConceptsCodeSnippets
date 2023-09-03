package com.practice.oop.innerClass.simple_example;

public class MainClass {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Adding items to the cart
		cart.addItem("Laptop", 1, 899.99);
		cart.addItem("Headphones", 2, 49.99);
		cart.addItem("Mouse", 3, 19.99);

		// Calculating and printing the total price
		double total = cart.calculateTotalPrice();

		System.out.println(cart.toString());

		System.out.println("Total price of items in the cart: $" + total);
		cart.removeItem("Headphones");

		// Recalculating and printing the total price
		total = cart.calculateTotalPrice();
		System.out.println("Total price after removing an item: $" + total);
		System.out.println(cart.toString());
	}

}
