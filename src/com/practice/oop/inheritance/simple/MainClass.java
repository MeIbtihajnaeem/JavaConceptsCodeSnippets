package com.practice.oop.inheritance.simple;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Calling Default Constructor of B and A");
		B objDefault = new B();

		System.out.println("Calling Paramerised Constructor of C and default constructor of A");
		C objParamAndDefault = new C(1);

		System.out.println("Calling Paramerised Constructor of B and A");
		B objParam = new B(1);

		System.out.println("Calling Paramerised Constructor of D and Default Constructor of A and D");
		D objDefaultAndParam = new D(1);
	}

}
