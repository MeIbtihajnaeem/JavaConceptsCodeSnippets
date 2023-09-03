package com.practice.oop.abstracts.car_exp;

public class MainClass {

	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Suzuki("Mehran", 200000, 10, 2015, 15000);
		car[1] = new Toyota("Corolla", 2000000, 30, 2022, 30000, 5);
		car[2] = new Suzuki("Cultus", 300000, 15, 2020, 30000);

		for (Car c : car) {
			c.printDetails();
			System.out.println("Tax Price " + c.taxExcludingPrice());
			System.out.println("Estimated Price " + c.estimatedPriceIncludingTax());
			System.out.println("Actual Price " + c.actualPrice());
			System.out.println("------------");

		}

	}

}
