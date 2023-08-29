package com.practice.commons.generatedHashCodeAndEqualMethods;

public class MainClass {

	public static void main(String[] args) {
		Laptop obj1 = new Laptop("Lenovo yoga", 1000);
		Laptop obj2 = new Laptop("Lenovo yoga", 1000);
		Laptop obj3 = new Laptop("Lenovo yoga", 2000);
		Laptop obj4 = new Laptop("yoga", 1000);
		Laptop obj5 = new Laptop();

		Laptop[] objects = new Laptop[5];
		objects[0] = obj1;
		objects[1] = obj2;
		objects[2] = obj3;
		objects[3] = obj4;
		objects[4] = obj5;

		for (Laptop laptop1 : objects) {
			for (Laptop laptop2 : objects) {
				System.out.println(
						laptop1.toString() + "is equal to " + laptop2.toString() + ": " + laptop1.equals(laptop2));

			}
		}

	}

}
