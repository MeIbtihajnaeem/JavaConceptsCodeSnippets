package com.practice.oop.interfaceExample.paymentGatewayExample;

public class MainClass {

	public static void main(String[] args) {
		PaymentMethod creditCardPayment = new CreditCardPayment("1234567890123456", "12/25", "123");
		PaymentMethod payPalPayment = new PaypalPayment("example@example.com", "password123");
		PaymentMethod cryptoPayment = new CryptocurrencyPayment("Bitcoin");

		// Create a PaymentProcessor
		PaymentProcessor paymentProcessor = new PaymentProcessor();

		// Process payments
		paymentProcessor.processPayment(creditCardPayment, 100.0);
		paymentProcessor.processPayment(payPalPayment, 50.0);
		paymentProcessor.processPayment(cryptoPayment, 0.01);
	}

}
