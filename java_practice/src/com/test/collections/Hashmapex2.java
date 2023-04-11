package com.test.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex2 {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Grapes");

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
