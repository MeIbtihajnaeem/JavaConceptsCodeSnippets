package com.practice.oop.inheritance.methodOverriding;

public class B extends A {

	// This is method overriding since show method is common
	// in both A and B but instead of accessing show method of
	// A we will use show method of B and config method of A
	public void show() {
		System.out.println("This is Show in B");
	}

}
