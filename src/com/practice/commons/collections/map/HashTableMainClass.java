package com.practice.commons.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMainClass {

	public static void main(String[] args) {
		// This is syncronized version of HashMap
		// very use full when working with threads
		Map<String, Integer> students = new Hashtable<>();

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
