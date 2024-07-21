package com;

public class TryWithFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int res = 100/0;
			System.out.println("no exception");
		} finally {
				System.out.println("finally block");
		}
		System.out.println("normal statement");
	}
}

/*
	Output
	Hi
	int res = 100/1;
	no exception
	finally block
	normal statement
	--------------------------------------------
	Hi
	int res = 100/0;
	Exception in thread "main" finally block
	java.lang.ArithmeticException: / by zero
		at com.TryWithFinally.main(TryWithFinally.java:8)
*/