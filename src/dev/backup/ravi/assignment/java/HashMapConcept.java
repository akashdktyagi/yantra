package dev.backup.ravi.assignment.java;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		hm.put(1, "selenium");
		hm.put(2, "qtp");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		System.out.println(hm.get(2));
		
	}

}
