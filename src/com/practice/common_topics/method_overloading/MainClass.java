package com.practice.common_topics.method_overloading;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.add(1.1, 2));
		System.out.println(cal.add(1, 2,3));
		System.out.println(cal.add(1.1, 2,3));

	}

}
