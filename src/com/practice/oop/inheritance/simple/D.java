package com.practice.oop.inheritance.simple;

public class D extends A {
	public D() {
		// this constructor is default and cannot be written
		super();
		System.out.println("Default Constructor of D");
	}

	public D(int n) {
		// if we want to call parameterised constructor of A
		// then we have to write this constructor
		this();
		System.out.println("Parameterised Constructor of D");
	}
}
