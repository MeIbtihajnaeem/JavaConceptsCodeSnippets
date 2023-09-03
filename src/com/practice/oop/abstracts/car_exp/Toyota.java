package com.practice.oop.abstracts.car_exp;

public class Toyota extends Car {

	private double serviceCharges;
	private double serviceTax;

	public Toyota(String carModel, double price, double taxPercentage, double year, double serviceCharges,
			double serviceTax) {
		super(carModel, "Toyota", price, taxPercentage, year);
		this.serviceCharges = serviceCharges;
		this.serviceTax = serviceTax;
	}

	@Override
	public double taxExcludingPrice() {
		double tax = (this.getTaxPercentage() / 100) * this.getPrice();
		double serviceTax = (this.serviceTax / 100) * this.getPrice();
		return tax + serviceTax;

	}

	@Override
	public double actualPrice() {
		double tax = this.taxExcludingPrice();
		double year = this.getYear();
		int depreciationPercentage = year > 2019 ? 5 : year > 2013 ? 10 : 25;
		double depreciationPrice = (depreciationPercentage / 100) * this.getPrice();
		double totalPrice = (this.serviceCharges + tax + this.getPrice()) - depreciationPrice;
		return totalPrice;
	}

}
