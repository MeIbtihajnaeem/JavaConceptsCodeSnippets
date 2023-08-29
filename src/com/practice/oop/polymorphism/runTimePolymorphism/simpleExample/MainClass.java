package com.practice.oop.polymorphism.runTimePolymorphism.simpleExample;

public class MainClass {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();

		obj = new B();
		obj.show();

		obj = new C();
		obj.show();

	}

}
