package com;

import java.util.HashSet;
class A{}
class B{}
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		int a=10;
		//Integer b = new Integer(a);
		Integer b = 10;
		hs.add(10);  // auto-boxing :converting primitive to Object 
		hs.add(10.10);
		hs.add("Ravi");
		hs.add(true);
		hs.add(new A());
		hs.add(new B());
		System.out.println(hs);
	}
}

/*
	Output
	[com.A@6dde5c8c, Ravi, 10.1, com.B@52525845, 10, true]
*/