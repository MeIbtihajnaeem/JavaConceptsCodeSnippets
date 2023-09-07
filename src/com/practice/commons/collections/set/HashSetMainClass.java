package com.practice.commons.collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserClass other = (UserClass) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}

public class HashSetMainClass {

	public static void main(String[] args) {
		// Set is used when we don't want repeated value
		// Does not support index value
		// HashSet don't sort collection
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(7);
		nums.add(4);
		nums.add(2);
		nums.add(3);

		for (Integer n : nums) {
			System.out.println(n);
		}

		Set<String> strs = new HashSet<String>();
		strs.add("Ibtihaj");
		strs.add("Naeem");
		strs.add("Ahmed");
		strs.add("Ali");
		strs.add("Noman");
		strs.add("Ali");

		for (String s : strs) {
			System.out.println(s);
		}

		Set<UserClass> users = new HashSet<UserClass>();

		// I have added custom equals override method
		// to compare name only since set uses equals method
		users.add(new UserClass("Ibtihaj", 23));
		users.add(new UserClass("Naeem", 40));
		users.add(new UserClass("Naeem", 40));
		users.add(new UserClass("Naeem", 40));
		users.add(new UserClass("Naeem", 40));
		users.add(new UserClass("Ahmed", 19));
		users.add(new UserClass("Ali", 18));
		users.add(new UserClass("Noman", 28));

		for (UserClass user : users) {
			System.out.println(user);
		}

	}

}
