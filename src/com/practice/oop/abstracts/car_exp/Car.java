package com.practice.oop.abstracts.car_exp;

abstract public class Car {
	final private String carModel;
	final private String carMake;
	final private double price;
	final private double taxPercentage;
	final private double year;

	public Car(String carModel, String carMake, double price, double taxPercentage, double year) {
		super();
		this.carModel = carModel;
		this.carMake = carMake;
		this.price = price;
		this.taxPercentage = taxPercentage;
		this.year = year;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarMake() {
		return carMake;
	}

	public double getPrice() {
		return price;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public double getYear() {
		return year;
	}

	public abstract double taxExcludingPrice();

	public abstract double actualPrice();

	public void printDetails() {
		System.out.println("Car Model: " + carModel + " Car make: " + carMake + " price:" + price + " year: " + year
				+ " tax: " + taxPercentage + "%");
	}

	public double estimatedPriceIncludingTax() {
		double tax = (taxPercentage / 100) * price;
		int depreciationPercentage = year > 2021 ? 5 : year > 2015 ? 10 : 25;
		double depreciationPrice = (depreciationPercentage / 100) * price;
		double estimatedPrice = (tax + price) - depreciationPrice;
		return estimatedPrice;
	}

}
