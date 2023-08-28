package com.practice.oop.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Student std = new Student();
		
		std.setName("Ibtihaj");
		std.setAge(23);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());

	}

}
