package com.practice.oop.lambdaExpressions.shopping_cart_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ShoppingCart implements Iterable<Item> {
	private List<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public double calculateTotalPrice(Function<Double, Double> discountFunction) {
		double totalPrice = 0;
		for (Item item : items) {
			double discountedPrice = discountFunction.apply(item.getPrice());
			totalPrice += discountedPrice;
		}
		return totalPrice;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ItemIterator();
	}

	private class ItemIterator implements Iterator<Item> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentIndex < items.size();
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return items.get(currentIndex++);
		}

	}

}
