package com.practice.commons.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMainClass {

	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();

		students.put("Ibtihaj", 80);
		students.put("Naeem", 20);
		students.put("Ali", 100);
		students.put("Tahir", 70);
		students.put("Naeem", 90);

		for (String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key));
		}

	}

}
