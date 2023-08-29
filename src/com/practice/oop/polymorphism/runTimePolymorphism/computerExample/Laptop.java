package com.practice.oop.polymorphism.runTimePolymorphism.computerExample;

public class Laptop extends Computer {
	public Laptop(String company, double price) {
		super(company, price);
	}

	private boolean numericKeyboard;

	public boolean isNumericKeyboard() {
		return numericKeyboard;
	}

	public void setNumericKeyboard(boolean numericKeyboard) {
		this.numericKeyboard = numericKeyboard;
	}
	
	public void turnOn() {
		System.out.println("Laptop turns on");
	}

}
