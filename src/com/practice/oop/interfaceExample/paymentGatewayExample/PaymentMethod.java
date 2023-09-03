package com.practice.oop.interfaceExample.paymentGatewayExample;

interface PaymentMethod {

	void processPayment(double amount);
	boolean validatePayment();
}
