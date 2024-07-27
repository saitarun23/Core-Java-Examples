package com;

public class WrapperClasses {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);// primitive value
		// converting primitive to object 
		//Integer b = new Integer(a);
		//Integer b = a;
		Integer b = 100;		// auto-boxing : converting primitive to object 
		System.out.println(b);// it consider as object 
		// converting to object to primitive 
		int c = b.intValue();
		float d = b.floatValue();
		int e = b;	// auto-unboxing : converting object to primitive 
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}

/*
	Output
	10
	100
	100
	100.0
	100
*/