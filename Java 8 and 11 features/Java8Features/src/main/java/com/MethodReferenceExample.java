package com;

import java.util.ArrayList;
import java.util.List;

interface Welcome{
	public int add(int a, int b);
}
class WelcomeStaticImp {
	public static int add(int a, int b) {	// this logic big we want to use again and again 
		return a+b;
	}
}
class WelcomeNonStaticImp {
	public int add(int a, int b) {     // this is non static method 
		return a+b;
	}
}
public class MethodReferenceExample {
	public static void main(String[] args) {
	// providing body for Welcome functional interface using lambda 
		Welcome i1 = (a,b)->a+b;
		System.out.println(i1.add(100, 200));
		Welcome i2 = WelcomeStaticImp::add;		// static method reference 
		System.out.println(i2.add(1, 2));
		WelcomeNonStaticImp ref =new WelcomeNonStaticImp();
		Welcome i3 = ref::add;				// non static method reference 
		System.out.println(i3.add(10, 20));
		List<Integer> ll=new ArrayList<Integer>();
		ll.stream().forEach(e->System.out.println(e));
		ll.stream().forEach(System.out::println);
		ll.stream().forEach(MethodReferenceExample::accept);
	}
	public static void accept(Integer i) {
		System.out.println("Value is "+i);
	}
}