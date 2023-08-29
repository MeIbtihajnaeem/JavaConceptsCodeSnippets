package com.practice.oop.polymorphism.runTimePolymorphism.computerExample;

public class MainClass {

	public static void main(String[] args) {
		Computer[] computers = new Computer[3];

		computers[0] = new Laptop("Dell", 100);

		computers[1] = new MobilePhone("Iphone", 1000);

		computers[2] = new Computer("Abacas", 100);

		for (Computer comp : computers) {
			comp.turnOn();
		}

	}

}
