package com.practice.oop.polymorphism.runTimePolymorphism.mostImportantOnlineShoppingSystemExample;

public class MainClass {

	public static void main(String[] args) {
		Product[] products = new Product[3];
		products[0] = new Electronics("Computer", 100, true);
		products[1] = new Clothing("Shirt", 100, 2.5);
		products[2] = new Books("Computer", 100, "Ibtihaj");

		for (Product p : products) {
			p.displayDetails();
			if (p instanceof Electronics) {
				((Electronics) p).claimWarranty();
			} else if (p instanceof Clothing) {
				((Clothing) p).applyDiscount();
			} else if (p instanceof Books) {
				((Books) p).downloadPdf();
			}
		}

	}

}
