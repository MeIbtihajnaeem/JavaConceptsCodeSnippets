package com.practice.commons.collections.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class UserClassForTree implements Comparable<UserClassForTree> {
	public static int currentId;
	private final String name;
	private final int age;
	private final int id;

	public UserClassForTree(String name, int age) {
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
		UserClassForTree other = (UserClassForTree) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int compareTo(UserClassForTree o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}

public class TreeSetWithCollectionsMainClass {

	public static void main(String[] args) {
		// Set is used when we don't want repeated value
		// Does not support index value
		// TreeSet does sort collection
		Collection<Integer> nums = new TreeSet<Integer>();
		nums.add(4);
		nums.add(2);
		nums.add(3);
		nums.add(7);
		nums.add(4);
		nums.add(2);
		nums.add(3);

		Iterator<Integer> iteratorNums = nums.iterator();
		while (iteratorNums.hasNext()) {
			System.out.println(iteratorNums.next());
		}

		Collection<String> strs = new TreeSet<String>();
		strs.add("Ibtihaj");
		strs.add("Naeem");
		strs.add("Ahmed");
		strs.add("Ali");
		strs.add("Noman");
		strs.add("Ali");

		Iterator<String> iteratorStr = strs.iterator();
		while (iteratorStr.hasNext()) {
			System.out.println(iteratorStr.next());
		}

		Collection<UserClassForTree> users = new TreeSet<UserClassForTree>();

		try {
			// I have added custom equals override method
			// I have also implemented user with Comparable
			// and override the comapreTo method
			// to compare name only since set uses equals method
			users.add(new UserClassForTree("Ibtihaj", 23));
			users.add(new UserClassForTree("Naeem", 40));
			users.add(new UserClassForTree("Naeem", 40));
			users.add(new UserClassForTree("Naeem", 40));
			users.add(new UserClassForTree("Naeem", 40));
			users.add(new UserClassForTree("Ahmed", 19));
			users.add(new UserClassForTree("Ali", 18));
			users.add(new UserClassForTree("Noman", 28));

			Iterator<UserClassForTree> iteratorUsers = users.iterator();
			while (iteratorUsers.hasNext()) {
				System.out.println(iteratorUsers.next());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
