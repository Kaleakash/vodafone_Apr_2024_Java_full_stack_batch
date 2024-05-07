package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap Example 
//		HashMap hm = new HashMap();	// unorder 
//		hm.put(2, "Steven");
//		hm.put(1, "Lex");
//		hm.put(5, "John");
//		hm.put(3, "Neena");
//		hm.put("A", "B");
//		System.out.println(hm);
//		hm.put(1, "Akash");
//		System.out.println(hm);
//		hm.put(10, "Steven");
//		System.out.println(hm);
//		System.out.println("get value "+hm.get(1));
//		System.out.println("present key "+hm.containsKey(1));
//		System.out.println("preent value "+hm.containsValue("Neena"));
		
//		// LinkedHashMap Example 
//		
//		LinkedHashMap hm = new LinkedHashMap();	// order 
//		hm.put(2, "Steven");
//		hm.put(1, "Lex");
//		hm.put(5, "John");
//		hm.put(3, "Neena");
//		hm.put("A", "B");
//		System.out.println(hm);
//		hm.put(1, "Akash");
//		System.out.println(hm);
//		hm.put(10, "Steven");
//		System.out.println(hm);
//		System.out.println("get value "+hm.get(1));
//		System.out.println("present key "+hm.containsKey(1));
//		System.out.println("preent value "+hm.containsValue("Neena"));
		
//		// TreeHashMap Example 
//		
//				TreeMap hm = new TreeMap();	// order 
//				hm.put(2, "Steven");
//				hm.put(1, "Lex");
//				hm.put(5, "John");
//				hm.put(3, "Neena");
//				//hm.put("A", "B");
//				System.out.println(hm);
//				hm.put(1, "Akash");
//				System.out.println(hm);
//				hm.put(10, "Steven");
//				System.out.println(hm);
//				System.out.println("get value "+hm.get(1));
//				System.out.println("present key "+hm.containsKey(1));
//				System.out.println("preent value "+hm.containsValue("Neena"));
		
		// TreeHashMap Example 
		
		Hashtable hm = new Hashtable();// legacy class and by default all methods are sychronized.  
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
