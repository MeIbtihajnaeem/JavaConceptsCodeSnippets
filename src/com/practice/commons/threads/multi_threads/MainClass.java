package com.practice.commons.threads.multi_threads;

class A extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello");
		}
	}
}

public class MainClass {

	public static void main(String[] args) {

		A obj1 = new A();
		B obj2 = new B();

		obj1.start();
		obj2.start();

	}

}
