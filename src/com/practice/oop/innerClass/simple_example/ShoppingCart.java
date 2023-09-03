package com.practice.oop.innerClass.simple_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	private final List<CartItem> cart;

	public ShoppingCart() {
		super();
		this.cart = new ArrayList<>();
	}

	@Override
	public String toString() {
		Iterator<CartItem> iterator = cart.iterator();
		String data = "";
		while (iterator.hasNext()) {
			CartItem item = iterator.next();
			data += item.toString() + "\n";
		}
		return data;
	}

	public void addItem(String productName, int quantity, double pricePerUnit) {
		cart.add(new CartItem(productName, quantity, pricePerUnit));
	}

	public void removeItem(String productName) {
		CartItem requestedCart = new CartItem(productName, 0, 0);
		Iterator<CartItem> iterator = cart.iterator();
		while (iterator.hasNext()) {
			CartItem item = iterator.next();
			if (item.equals(requestedCart)) {
				iterator.remove();
			}
		}

	}

	public double calculateTotalPrice() {
		double totalPrice = 0.0;
		for (CartItem item : cart) {
			totalPrice += item.getItemTotal();
		}
		return totalPrice;
	}

	class CartItem {
		private final String productName;
		private final int quantity;
		private final double pricePerUnit;

		public CartItem(String productName, int quantity, double pricePerUnit) {
			super();
			this.productName = productName;
			this.quantity = quantity;
			this.pricePerUnit = pricePerUnit;
		}

		@Override
		public boolean equals(Object obj) {
			CartItem other = (CartItem) obj;
			return productName == other.productName;
		}

		@Override
		public String toString() {
			return "CartItem [productName=" + productName + ", quantity=" + quantity + ", pricePerUnit=" + pricePerUnit
					+ "]";
		}

		public String getProductName() {
			return productName;
		}

		public int getQuantity() {
			return quantity;
		}

		public double getPricePerUnit() {
			return pricePerUnit;
		}

		public double getItemTotal() {
			return quantity * pricePerUnit;
		}

	}
}
