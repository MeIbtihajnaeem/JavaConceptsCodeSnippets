package com.practice.commons.exceptionHandling;

public class MultiExceptionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;

		int nums[] = new int[5];

		try {
			j = 18 / i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array limit reached");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(j);
	}

}
