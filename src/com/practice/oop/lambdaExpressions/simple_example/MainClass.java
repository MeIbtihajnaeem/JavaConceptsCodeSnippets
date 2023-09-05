package com.practice.oop.lambdaExpressions.simple_example;

public class MainClass {

	public static void main(String[] args) {

		// lambda expression is a new feature in java8
		A obj1 = () -> {
			System.out.println("This is a lambda expression");
		};
		obj1.showA();

		B obj2 = (int i) -> {
			System.out.println("Lambda Expression with parameters: " + i);
		};
		obj2.showB(5);

		// more optimise way for a single param
		B obj3 = i -> System.out.println("Lambda Expression with parameters: " + i);
		obj3.showB(10);

		// with 2 params

		C obj4 = (name, age) -> System.out.println("Lambda Expression with parameters: Name: " + name + " age: " + age);

		obj4.showC("Ibtihaj", 25);
	}

}
