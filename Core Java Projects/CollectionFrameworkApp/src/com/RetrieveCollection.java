package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetrieveCollection {

	public static void main(String[] args) {
		// Set Retrieve 
		Set<Integer> ss1 = new HashSet<Integer>();
		ss1.add(10);ss1.add(20);ss1.add(40);ss1.add(30);
		System.out.println(ss1);
		System.out.println("using for each loop for set");
		for(int n:ss1) {
			System.out.println(n);
		}
		System.out.println("using iterator");
		Iterator<Integer> li = ss1.iterator();
		while(li.hasNext()) {
				int n = li.next();
				System.out.println(n);
		}
	}
}
