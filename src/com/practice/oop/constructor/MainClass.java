package com.practice.oop.constructor;

public class MainClass {

	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student("Ali", 36);

		System.out.println("Student Name: " + std1.getName() + " With Age: " + std1.getAge());
		System.out.println("Student Name: " + std2.getName() + " With Age: " + std2.getAge());

	}

}
