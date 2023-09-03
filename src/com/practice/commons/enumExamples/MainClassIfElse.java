package com.practice.commons.enumExamples;

public class MainClassIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status status = Status.FAILED;

		// Use if-else statements to print the result based on the status
		if (status == Status.FAILED) {
			System.out.println("Status is FAILED");
		} else if (status == Status.SUCCESS) {
			System.out.println("Status is SUCCESS");
		} else if (status == Status.PENDING) {
			System.out.println("Status is PENDING");
		} else if (status == Status.INITIAL) {
			System.out.println("Status is INITIAL");
		} else {
			System.out.println("Unknown Status");
		}
	}

}
