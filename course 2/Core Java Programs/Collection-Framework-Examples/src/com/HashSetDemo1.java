package com;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();	// it display the records unorders
		hs.add(3);
		hs.add(1);
		hs.add("Ravi");
		hs.add(6);
		hs.add(8);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);  // it display the result as string format. 
		System.out.println("Search "+hs.contains(3));
		System.out.println("Search "+hs.contains(30));
		hs.remove("Ravi");	// remove using value 
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		hs.clear();
		System.out.println(hs);
		System.out.println("Size "+hs.size());
	}

}
