package com.practice.oop.polymorphism.runTimePolymorphism.onlineShoppingSystemExample;

public class Electronics extends Product {

	final boolean chargeable;

	Electronics(String name, double price, boolean chargeable) {
		super(name, price);
		this.chargeable = chargeable;
	}

	public void claimWarranty() {
		System.out.println("Your request has been forwarded");
	}

	public void displayDetails() {
		System.out.println("Electronics Name: " + name);
		System.out.println("Electronics Price: " + price);
		System.out.println("Electronics is chargeable: " + chargeable);

	}

}
