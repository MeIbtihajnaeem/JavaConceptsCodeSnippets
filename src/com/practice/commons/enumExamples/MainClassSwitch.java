package com.practice.commons.enumExamples;

public class MainClassSwitch {

	public static void main(String[] args) {
		Status status = Status.SUCCESS;

		// Use a switch statement to print the result based on the status
		switch (status) {
		case FAILED:
			System.out.println("Status is FAILED");
			break;
		case SUCCESS:
			System.out.println("Status is SUCCESS");
			break;
		case PENDING:
			System.out.println("Status is PENDING");
			break;
		case INITIAL:
			System.out.println("Status is INITIAL");
			break;
		default:
			System.out.println("Unknown Status");
		}
	}

}
