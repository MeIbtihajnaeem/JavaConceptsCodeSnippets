package com.practice.oop.polymorphism.runTimePolymorphism.onlineShoppingSystemExample;

public class Books extends Product {
	final String author;

	Books(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}

	public void downloadPdf() {
		System.out.println("Pdf Downloading Started");
	}
	public void displayDetails() {
		System.out.println("Book Name: " + name);
		System.out.println("Book Price: " + price);
		System.out.println("Book author: " + author);


	}

}
