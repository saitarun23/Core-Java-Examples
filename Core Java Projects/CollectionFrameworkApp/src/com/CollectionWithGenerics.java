package com;

import java.util.ArrayList;
import java.util.List;
public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection without Generics 
//		List ll1  = new ArrayList();
//		ll1.add(10);
//		ll1.add(10.20);
//		ll1.add("Ravi");
//		ll1.add(true);
	//	
//		Object obj = ll1.get(3);
//		Integer i = (Integer)obj; // down level type casting 
//		int n = i.intValue();
//		System.out.println(n);
		// Collection with generics 
		List<Integer> ll1 = new ArrayList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		
		int n = ll1.get(0);
		System.out.println(n);
	}
}
