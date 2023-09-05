package com.practice.commons.exceptionHandling;

class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	CustomException(String error) {
		super(error);
	}
}

public class CustomExceptionMain {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		try {
			j = 18 / i;
			if (j == 0) {
				throw new CustomException(" This is the new error");
			}
		} catch (CustomException e) {
			System.out.println("Error: " + e.toString());
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(j);

	}

}
