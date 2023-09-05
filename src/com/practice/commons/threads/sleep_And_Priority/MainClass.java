package com.practice.commons.threads.sleep_And_Priority;


class A extends Thread {
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

class B extends Thread {
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

		A obj1 = new A();
		B obj2 = new B();
		
		// 1 is the least priority and 10 is the max priority
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(3);
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());

		
		obj1.start();
		obj2.start();

	}

}
