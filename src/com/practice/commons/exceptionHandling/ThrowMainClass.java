package com.practice.commons.exceptionHandling;

public class ThrowMainClass {

	public static void main(String[] args) {

		int i = 20;
		int j = 0;
		try {
			j = 18 / i;
			if (j == 0) {
				throw new ArithmeticException(" This is the new error");
			}
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array limit reached");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(j);

	}

}
