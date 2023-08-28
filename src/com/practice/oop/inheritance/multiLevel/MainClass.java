package com.practice.oop.inheritance.multiLevel;

public class MainClass {

	public static void main(String[] args) {
		AdvanceCalculator advCal = new AdvanceCalculator();

		int add = advCal.add(1, 3);
		int sub = advCal.sub(1, 3);
		int mul = advCal.multiply(1, 3);
		int div = advCal.divide(1, 3);

		System.out.println("Add result " + add);
		System.out.println("Sub result " + sub);
		System.out.println("Multiply result " + mul);
		System.out.println("Divide result " + div);

		ScientificCalculator sciCal = new ScientificCalculator();
		int add1 = advCal.add(1, 3);
		int sub1 = advCal.sub(1, 3);
		int mul1 = advCal.multiply(1, 3);
		int div1 = advCal.divide(1, 3);
		double pow = sciCal.power(10, 3);
		System.out.println("Add result " + add1);
		System.out.println("Sub result " + sub1);
		System.out.println("Multiply result " + mul1);
		System.out.println("Divide result " + div1);
		System.out.println("Power result " + pow);

	}

}
