package com.practice.commons.staticMethodsAndVariablesAndBlock;

public class MainClassForStaticMethod {

	public static void main(String[] args) {
		Student std1 = new Student("Ibtihaj");
		Student std2 = new Student("Ibtisam");

		std1.show();
		std2.show();

		Student.showCurrentId();

	}

}
