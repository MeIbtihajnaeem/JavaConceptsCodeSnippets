package com.practice.commons.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

class UserClass {
	public static int currentId;
	private final String name;
	private final int age;
	private final int id;

	public UserClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.id = currentId;
		currentId++;
	}

	public static int getCurrentId() {
		return currentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}

public class ListMainClass {

	public static void main(String[] args) {
		// preferable when working with index

		List<Integer> nums = new ArrayList<Integer>();

		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(7);

		for (Integer n : nums) {
			System.out.println(n);
		}
		System.out.println("Value at index 3 is " + nums.get(3));

		List<String> strs = new ArrayList<String>();
		strs.add("Ibtihaj");
		strs.add("Naeem");
		strs.add("Ahmed");
		strs.add("Ali");
		strs.add("Noman");

		for (String s : strs) {
			System.out.println(s);
		}
		System.out.println("Value at index 3 is " + strs.get(3));

		List<UserClass> users = new ArrayList<UserClass>();

		users.add(new UserClass("Ibtihaj", 23));
		users.add(new UserClass("Naeem", 40));
		users.add(new UserClass("Ahmed", 19));
		users.add(new UserClass("Ali", 18));
		users.add(new UserClass("Noman", 28));

		for (UserClass user : users) {
			System.out.println(user);
		}

		System.out.println("Value at index 3 is " + users.get(3));

	}

}
