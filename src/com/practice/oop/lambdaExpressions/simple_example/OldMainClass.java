package com.practice.oop.lambdaExpressions.simple_example;

public class OldMainClass {

	public static void main(String[] args) {
		// Old method
		A oldObj = new A() {
			public void showA() {
				System.out.println("This is the old method");
			}
		};

		oldObj.showA();


	}

}
