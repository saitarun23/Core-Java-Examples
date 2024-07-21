package com;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String str = "10abc";
		try {
		int res = a/b;
		System.out.println("REsult is "+res);
		int res1 = abc[2];
		System.out.println("result1 is "+res1);
		System.out.println(str+10);   // 1010
		System.out.println(Integer.parseInt(str)+10);// 20 
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
	-----------------------------------------------------------
	Hi
	REsult is 10
	result1 is 30
	10abc10
	name and message java.lang.NumberFormatException: For input string: "10abc"
	bye...
	bye...
	bye...
*/