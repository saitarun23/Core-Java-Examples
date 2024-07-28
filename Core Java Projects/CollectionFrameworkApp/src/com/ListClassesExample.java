package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClassesExample {

	public static void main(String[] args) {
		
		// ArrayList
/*		List ll1=new ArrayList();
		ll1.add(10);
		ll1.add(30);
		ll1.add(50);
		ll1.add(20);
		ll1.add(80);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.add(1, 100);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.remove(2); 	// remove using index 
		Integer i = 50;
		ll1.remove(i);		// remove using index 
		System.out.println(ll1);
		System.out.println("search "+ll1.contains(10));
		System.out.println("search "+ll1.contains(100));
		
		Output
		[10, 30, 50, 20, 80]
		find value using index 30
		[10, 100, 30, 50, 20, 80]
		find value using index 100
		[10, 100, 20, 80]
		search true
		search true
*/
		
		//LinkedList
		LinkedList ll1=new LinkedList();
		ll1.add(10);
		ll1.add(30);
		ll1.add(50);
		ll1.add(20);
		ll1.add(80);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.add(1, 100);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.remove(2); 	// remove using index 
		Integer i = 50;
		ll1.remove(i);		// remove using index 
		System.out.println(ll1);
		System.out.println("search "+ll1.contains(10));
		System.out.println("search "+ll1.contains(100));
		System.out.println("first element "+ll1.getFirst());
		System.out.println("last element "+ll1.getLast());
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		
/*
		Output
		[10, 30, 50, 20, 80]
		find value using index 30
		[10, 100, 30, 50, 20, 80]
		find value using index 100
		[10, 100, 20, 80]
		search true
		search true
		first element 10
		last element 80
		[100, 20]

 */
	}
}