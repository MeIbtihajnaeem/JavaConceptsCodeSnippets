package com.practice.commons.collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;

class User {
	public static int currentId;
	private final String name;
	private final int age;
	private final int id;

	public User(String name, int age) {
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

public class CollectionMainClass {

	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<Integer>();

		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(7);

		for (Integer n : nums) {
			System.out.println(n);
		}

		Collection<String> strs = new ArrayList<String>();
		strs.add("Ibtihaj");
		strs.add("Naeem");
		strs.add("Ahmed");
		strs.add("Ali");
		strs.add("Noman");

		for (String s : strs) {
			System.out.println(s);
		}

		Collection<User> users = new ArrayList<User>();

		users.add(new User("Ibtihaj", 23));
		users.add(new User("Naeem", 40));
		users.add(new User("Ahmed", 19));
		users.add(new User("Ali", 18));
		users.add(new User("Noman", 28));

		for (User user : users) {
			System.out.println(user);
		}

	}

}
