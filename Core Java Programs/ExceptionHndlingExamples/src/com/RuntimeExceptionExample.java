package com;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
			try {
			int res = a/b;
			System.out.println("Result is "+res);
			}catch(Exception e) {
				//System.out.println("I Take Care!");
				//System.out.println(e.getMessage()); // short exception message 
				//System.out.println(e.toString());
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
