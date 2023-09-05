package com.practice.commons.threads.runnable_vs_threads;

class D {
	public void show() {
		System.out.println("I am a parent class");
	}
}

class A extends D implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends D implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MainClass {

	public static void main(String[] args) {

		Runnable obj1 = new A();
		Runnable obj2 = new B();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}

}
