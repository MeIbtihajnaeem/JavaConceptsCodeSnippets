package com.practice.commons.threads.race_condition_thread_safe;

class Counter {
	int count;

	// synchronized keyword will make sure one thread can
	// access this resource at a time
	public synchronized void increament() {
		count++;
	}
}

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
		Runnable obj1 = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increament();
			}
		};
		Runnable obj2 = () -> {
			for (int i = 0; i < 10000; i++) {
				c.increament();
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

		// This will stop main method to finish 
		//the program before the completion of t1 and t2
		t1.join();
		t2.join();

		System.out.print(c.count);
	}

}
