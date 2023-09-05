package com.practice.oop.lambdaExpressions.shopping_cart_example;

public class MainClass {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Add items to the cart
		cart.add(new Item("Item 1", 50.0));
		cart.add(new Item("Item 2", 30.0));
		cart.add(new Item("Item 3", 25.0));

		// Define lambda expressions for discounts
		Discount percentageDiscount = originalPrice -> originalPrice * 0.8; // 20% off
		Discount fixedDiscount = originalPrice -> originalPrice - 10.0; // $10 off
		Discount buyOneGetOneFreeDiscount = originalPrice -> originalPrice / 2.0; // Buy one, get one free

		// Calculate total price with different discounts
		double totalWithPercentageDiscount = cart.calculateTotalPrice(percentageDiscount::applyDiscount);
		double totalWithFixedDiscount = cart.calculateTotalPrice(fixedDiscount::applyDiscount);
		double totalWithBOGODiscount = cart.calculateTotalPrice(buyOneGetOneFreeDiscount::applyDiscount);

		// Display the results
		System.out.println("Total with 20% off: $" + totalWithPercentageDiscount);
		System.out.println("Total with $10 off: $" + totalWithFixedDiscount);
		System.out.println("Total with Buy One Get One Free: $" + totalWithBOGODiscount);

	}

}
