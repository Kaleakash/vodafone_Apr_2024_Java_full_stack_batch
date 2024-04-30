package com;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap Example 
		HashMap hm = new HashMap();	// unorder 
		hm.put(2, "Steven");
		hm.put(1, "Lex");
		hm.put(5, "John");
		hm.put(3, "Neena");
		hm.put("A", "B");
		System.out.println(hm);
		hm.put(1, "Akash");
		System.out.println(hm);
		hm.put(10, "Steven");
		System.out.println(hm);
		System.out.println("get value "+hm.get(1));
		System.out.println("present key "+hm.containsKey(1));
		System.out.println("preent value "+hm.containsValue("Neena"));
	}

}
