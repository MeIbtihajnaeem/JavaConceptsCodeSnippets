package com.practice.oop.inheritance.simple;

public class B extends A {
	public B() {
		// this constructor is default and cannot be written
		super();
		System.out.println("Default Constructor of B");
	}

	public B(int n) {
		// if we want to call parameterised constructor of A
		// then we have to write this constructor
		super(n);
		System.out.println("Parameterised Constructor of B");
	}
}
