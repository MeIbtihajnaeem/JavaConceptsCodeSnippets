package com.practice.oop.interfaceExample.paymentGatewayExample;

public class CryptocurrencyPayment implements PaymentMethod {
	private final String cryptocurrencyType;

	public CryptocurrencyPayment(String cryptocurrencyType) {
		super();
		this.cryptocurrencyType = cryptocurrencyType;
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
		if (cryptocurrencyType == "Bitcoin")
			return true;
		return false;
	}

}
