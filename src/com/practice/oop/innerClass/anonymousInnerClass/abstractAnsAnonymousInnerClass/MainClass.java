package com.practice.oop.innerClass.anonymousInnerClass.abstractAnsAnonymousInnerClass;

public class MainClass {

	public static void main(String[] args) {
		A obj = new A() {

			public void show() {
				System.out.println("I am in abstract anonymous Inner class's method");
			}
		};

		obj.show();

	}

}
