package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class RetrieveValueFromCollections {

	public static void main(String[] args) {
		// Set classes 
//		Set ss1 = new HashSet();
//		ss1.add(3); ss1.add(5); ss1.add(2); ss1.add(1); ss1.add(9); // auto-boxing 
//		System.out.println(ss1);
//		// using for each loop 
//		System.out.println("Retrieve element one by one using for each loop");
//		for(Object n:ss1) {
//			System.out.println(n);
//		}
//		System.out.println("Retrieve element one by one using iterator");
//		Iterator ii = ss1.iterator();// it point to set 
//		while(ii.hasNext()) {
//			Object obj = ii.next();
//			if(obj.equals(1)) {
//				System.out.println("yes");
//				ii.remove();
//			}
//			System.out.println(obj);	
//		}
//		System.out.println(ss1);
		// List classes 
		List ll = new ArrayList();
		ll.add(2);ll.add(1);ll.add(6);ll.add(8);
		System.out.println("Retriee elements one by one using for each");
		for(Object obj : ll) {
			System.out.println(obj);
		}
		System.out.println("Retrieve elements one by one using iterator");
		Iterator ii = ll.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		ListIterator li = ll.listIterator();
		System.out.println("Retreive element one by one using listiterator - forward direction");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Retreive element one by one using listiterator - backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		Vector vv = new Vector();
		vv.add(2);vv.add(1);vv.add(6);vv.add(8);vv.add(5);
		System.out.println("Retrieve element one by one using enumeration from Vector");
		Enumeration ee = vv.elements();
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
	}

}
