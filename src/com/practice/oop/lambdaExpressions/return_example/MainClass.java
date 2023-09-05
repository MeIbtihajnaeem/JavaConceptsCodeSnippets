package com.practice.oop.lambdaExpressions.return_example;

public class MainClass {

	public static void main(String[] args) {
		A obj = (i, j) -> i + j;

		int result = obj.add(5, 4);

		System.out.println(result);

	}

}
