package com.practice.commons.staticMethodsAndVariablesAndBlock;

public class Student {

	static int id;
	String name;

	static {
		id = 0;
		System.out.println("This is the static block");
	}

	Student(String name) {
		this.name = name;
		System.out.println("This is the Constructor");
	}

	public void show() {
		System.out.println("Name of student is " + name);
	}

	public static void showCurrentId() {
		System.out.println("Current id is " + id);
	}

}
