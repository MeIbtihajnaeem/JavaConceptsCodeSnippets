package com.practice.oop.polymorphism.runTimePolymorphism.shapeExample;

public class MainClass {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];

		shapes[0] = new Circle();
		shapes[1] = new Triangle();
		shapes[2] = new Square();
		shapes[3] = new Shape();

		for (Shape shape : shapes) {
			System.out.println("-----------------");
			shape.calculateArea();
			shape.draw();
		}

	}

}
