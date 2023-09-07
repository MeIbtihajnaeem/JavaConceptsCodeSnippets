package com.practice.commons.collections.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class User implements Comparable<User> {
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
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}

public class TreeSetMainClass {

	public static void main(String[] args) {
		// Set is used when we don't want repeated value
		// Does not support index value
		// TreeSet does sort collection
		Set<Integer> nums = new TreeSet<Integer>();
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

		Set<String> strs = new TreeSet<String>();
		strs.add("Ibtihaj");
		strs.add("Naeem");
		strs.add("Ahmed");
		strs.add("Ali");
		strs.add("Noman");
		strs.add("Ali");

		for (String s : strs) {
			System.out.println(s);
		}

		Set<User> users = new TreeSet<User>();

		try {
			// I have added custom equals override method
			// I have also implemented user with Comparable
			// and override the comapreTo method
			// to compare name only since set uses equals method
			users.add(new User("Ibtihaj", 23));
			users.add(new User("Naeem", 40));
			users.add(new User("Naeem", 40));
			users.add(new User("Naeem", 40));
			users.add(new User("Naeem", 40));
			users.add(new User("Ahmed", 19));
			users.add(new User("Ali", 18));
			users.add(new User("Noman", 28));

			for (User user : users) {
				System.out.println(user);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
