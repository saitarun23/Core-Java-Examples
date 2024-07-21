package com;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
		int res = a/b;
		System.out.println("REsult is "+res);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println("message "+e.getMessage());
			System.out.println("name and message "+e.toString());
		}
	System.out.println("bye...");
	System.out.println("bye...");
	System.out.println("bye...");

	}
}

/*
	Output
	Hi
	I Take Care!
	message / by zero
	name and message java.lang.ArithmeticException: / by zero
	bye...
	bye...
	bye...
*/