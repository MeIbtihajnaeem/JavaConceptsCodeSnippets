package com.practice.oop.abstracts.car_exp;

public class Suzuki extends Car {
	private final double serviceCharges;

	public Suzuki(String carModel, double price, double taxPercentage, double year, double serviceCharges) {
		super(carModel, "Suzuki", price, taxPercentage, year);
		this.serviceCharges = serviceCharges;
	}

	@Override
	public double taxExcludingPrice() {
		double tax = (this.getTaxPercentage() / 100) * this.getPrice();
		return tax;
	}

	@Override
	public double actualPrice() {
		double tax = this.taxExcludingPrice();
		double year = this.getYear();
		int depreciationPercentage = year > 2020 ? 5 : year > 2017 ? 10 : 25;
		double depreciationPrice = (depreciationPercentage / 100) * this.getPrice();
		double totalPrice = (this.serviceCharges + tax + this.getPrice()) - depreciationPrice;
		return totalPrice;

	}

}
