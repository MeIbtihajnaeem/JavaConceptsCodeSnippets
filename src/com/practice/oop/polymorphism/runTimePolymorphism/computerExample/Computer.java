package com.practice.oop.polymorphism.runTimePolymorphism.computerExample;

public class Computer {
	String company;
	double price;

	public Computer(String company, double price) {
		super();
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.println("Computer turns on");
	}

}
