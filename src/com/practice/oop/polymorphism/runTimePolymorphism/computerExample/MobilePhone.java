package com.practice.oop.polymorphism.runTimePolymorphism.computerExample;

public class MobilePhone extends Computer {

	public MobilePhone(String company, double price) {
		super(company, price);
	}

	private boolean backCamera;

	public boolean isBackCamera() {
		return backCamera;
	}

	public void setBackCamera(boolean backCamera) {
		this.backCamera = backCamera;
	}
	
	public void turnOn() {
		System.out.println("MobilePhone turns on");
	}

}
