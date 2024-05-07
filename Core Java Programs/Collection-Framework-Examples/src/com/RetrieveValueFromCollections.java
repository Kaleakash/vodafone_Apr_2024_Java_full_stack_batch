package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetrieveValueFromCollections {

	public static void main(String[] args) {
		// Set classes 
		Set ss1 = new HashSet();
		ss1.add(3); ss1.add(5); ss1.add(2); ss1.add(1); ss1.add(9); // auto-boxing 
		System.out.println(ss1);
		// using for each loop 
		System.out.println("Retrieve element one by one using for each loop");
		for(Object n:ss1) {
			System.out.println(n);
		}
		System.out.println("Retrieve element one by one using iterator");
		Iterator ii = ss1.iterator();// it point to set 
		while(ii.hasNext()) {
			Object obj = ii.next();
			if(obj.equals(1)) {
				System.out.println("yes");
				ii.remove();
			}
			System.out.println(obj);	
		}
		System.out.println(ss1);
	}

}
