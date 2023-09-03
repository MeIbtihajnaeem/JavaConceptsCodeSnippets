package com.practice.oop.interfaceExample.paymentGatewayExample;

public class PaypalPayment implements PaymentMethod {

	private final String email;
	private final String password;

	public PaypalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void processPayment(double amount) {
		if (validatePayment()) {
			System.out.println("Transaction for amount: " + amount + " completed");
		} else {
			System.out.println("Transaction for amount: " + amount + " Failed");
		}
	}

	@Override
	public boolean validatePayment() {
		if (email.contains("@") && password.length() > 6)
			return true;
		return false;
	}

}
