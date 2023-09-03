package com.practice.oop.interfaceExample.paymentGatewayExample;

public class CreditCardPayment implements PaymentMethod {

	private final String cardNumber;
	@SuppressWarnings("unused")
	private final String expirationDate;
	@SuppressWarnings("unused")
	private final String cvv;

	public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
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
		if (cardNumber.length() == 16)
			return true;
		return false;
	}

}
