package com.practice.oop.inheritance;

// super() for A is their by default since very class in JAVA
// Extends Object class by default
public class A {
	public A() {
		// Extends Object class by default
		super();
		System.out.println("Default Constructor of A");
	}

	public A(int n) {
		// Extends Object class by default
		super();
		System.out.println("Parameterised Constructor of A");
	}
}
