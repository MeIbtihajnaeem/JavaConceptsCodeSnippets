package com.practice.oop.constructor;

public class Student {

	private String name;
	private int age;

	// Default Constructor
	public Student() {
		this.name = "Ibtihaj";
		this.age = 26;
	}

	// Parameterised Constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
