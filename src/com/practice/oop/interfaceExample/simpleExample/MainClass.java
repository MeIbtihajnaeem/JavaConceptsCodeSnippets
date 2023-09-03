package com.practice.oop.interfaceExample.simpleExample;

public class MainClass {

	public static void main(String[] args) {

		Computer lap = new Laptop();
		Computer desk = new Desktop();

		Developer ibtihaj = new Developer();
		ibtihaj.whatDoYouNeedToCode(desk);
		ibtihaj.whatDoYouNeedToCode(lap);
	}

}
