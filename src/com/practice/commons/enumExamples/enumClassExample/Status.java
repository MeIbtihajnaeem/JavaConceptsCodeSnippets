package com.practice.commons.enumExamples.enumClassExample;

public enum Status {
	FAILED(504), SUCCESS(200), PENDING(201), INITIAL;

	private final int errorCode;

	private Status() {
		this.errorCode = 000;
	}

	private Status(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
