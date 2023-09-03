package com.practice.commons.enumExamples.enumClassExample;

public class MainClass {

	public static void main(String[] args) {

		for (Status status : Status.values()) {
			switch (status) {
			case FAILED:
				System.out.println("Status is FAILED");
				System.out.println(status.getErrorCode());
				break;
			case SUCCESS:
				System.out.println("Status is SUCCESS");
				System.out.println(status.getErrorCode());
				break;
			case PENDING:
				System.out.println("Status is PENDING");
				System.out.println(status.getErrorCode());
				break;
			case INITIAL:
				System.out.println("Status is INITIAL");
				System.out.println(status.getErrorCode());
				break;
			default:
				System.out.println("Unknown Status");
				System.out.println(status.getErrorCode());
			}
		}
	}

}
