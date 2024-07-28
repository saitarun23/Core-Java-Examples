package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class RetrieveCollection {

	public static void main(String[] args) {
		// Set Retrieve 
//		Set<Integer> ss1 = new HashSet<Integer>();
//		ss1.add(10);ss1.add(20);ss1.add(40);ss1.add(30);
//		System.out.println(ss1);
//		System.out.println("using for each loop for set");
//		for(int n:ss1) {
//			System.out.println(n);
//		}
//		System.out.println("using iterator");
//		Iterator<Integer> li = ss1.iterator();
//		while(li.hasNext()) {
//				int n = li.next();
//				System.out.println(n);
//		}
		
		//List Retrieve
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);ll.add(20);ll.add(30);ll.add(40);ll.add(50);
		System.out.println(ll);
		System.out.println("for each");
		for(int n:ll) {
			System.out.println(n);
		}
		System.out.println("using iterator");
		Iterator<Integer> li = ll.iterator();
		while(li.hasNext()) {
			int n = li.next();
			System.out.println(n);
		}
		System.out.println("using list iterator - forward direction");
		ListIterator<Integer> li1=ll.listIterator();
		while(li1.hasNext()) {
			int n = li1.next();
			System.out.println(n);
		}
		System.out.println("using list iterator - backward direction");
		while(li1.hasPrevious()) {
			int n = li1.previous();
			System.out.println(n);
		}
	}
}
