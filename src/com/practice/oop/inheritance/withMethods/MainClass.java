package com.practice.oop.inheritance.withMethods;

public class MainClass {

	public static void main(String[] args) {
		AdvanceCalculator advCal = new AdvanceCalculator();

		int r1 = advCal.add(1, 3);
		int r2 = advCal.sub(1, 3);
		int r3 = advCal.multiply(1, 3);
		int r4 = advCal.divide(1, 3);

		System.out.println("Add result " + r1);
		System.out.println("Sub result " + r2);
		System.out.println("Multiply result " + r3);
		System.out.println("Divide result " + r4);

	}

}
