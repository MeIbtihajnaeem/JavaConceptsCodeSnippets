package com.practice.commons.generatedHashCodeAndEqualMethods;

import java.util.Objects;

public class Laptop {

	private String model;
	private int price;

	Laptop() {

	}

	Laptop(String model, int price) {
		this.model = model;
		this.price = price;
	}

	// Goto source --> generate toString()
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	// Goto source --> generate hashcode & equals

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

}
