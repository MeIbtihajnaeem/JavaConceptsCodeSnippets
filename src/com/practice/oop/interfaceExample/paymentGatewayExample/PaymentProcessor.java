package com.practice.oop.interfaceExample.paymentGatewayExample;

public class PaymentProcessor {
	public void processPayment(PaymentMethod paymentMethod, double amount) {
		paymentMethod.processPayment(amount);
	}
}
