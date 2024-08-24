package com;
interface Abc{
	void dis1();
	default void dis2() {
		System.out.println("dis2 default method");
	}
	default void dis3() {
		System.out.println("dis3 default method");
	}
	static void dis4() {
		System.out.println("dis4 static method");
	}
}

class Test implements Abc{
	@Override
	public void dis1() {
		System.out.println("Test class provided body for dis1 method");
	}
	@Override
	public void dis2() {
		System.out.println("Test class default method override");
	}
//	@Override
//	static void dis4() {
//		System.out.println("dis4 static method");
//	}
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.dis1();
		t1.dis2();
		t1.dis3();
		Abc.dis4();    // 	calling using interface name
	}
}

/*
 	Output
 	Test class provided body for dis1 method
	Test class default method override
	dis3 default method
	dis4 static method
*/