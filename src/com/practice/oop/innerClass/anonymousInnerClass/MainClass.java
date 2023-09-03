package com.practice.oop.innerClass.anonymousInnerClass;

public class MainClass {

	public static void main(String[] args) {

		A obj = new A() {
			public void show() {
				System.out.println("I am in anonymous Inner class");

			}
		};

		obj.show();

	}

}
