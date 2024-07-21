package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int res1 = 100/1;
			System.out.println(res1);
			int abc[]= {10,20,30,40};
			int res2 = abc[2];
			System.out.println(res2);
			String str = "10abc";
			System.out.println(Integer.parseInt(str)+100);
		}catch(ArithmeticException e) {
			System.out.println("divided by zero "+e.toString());
		}catch(ArrayIndexOutOfBoundsException|NumberFormatException e) {
			System.out.println("array index or number format "+e.toString());
		}catch (Exception e) {
			System.out.println("generic exception "+e.toString());
		}
		System.out.println("Normal Statement");
	}
}

/*
	Output
	Hi
	100
	30
	array index or number format java.lang.NumberFormatException: For input string: "10abc"
	Normal Statement
*/