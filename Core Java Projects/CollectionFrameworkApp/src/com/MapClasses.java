package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {

	public static void main(String[] args) {
		// HashMap
//		Map mm = new HashMap();
//		mm.put(3, "Ravi");
//		mm.put(1, "Raju");
//		mm.put(4, "Ramesh");
//		mm.put(2, "Rajesh");
//		mm.put("a", "b");
//		mm.put(3, "Mahesh");
//		mm.put(null, "c");
//		mm.put(10, null);
//		mm.put(null, null);
//		System.out.println(mm);
//		System.out.println("search key "+mm.containsKey(3));
//		System.out.println("search key "+mm.containsKey(10));
//		System.out.println("search value "+mm.containsValue("Ravi"));
//		System.out.println("search value "+mm.containsValue("Mahesh"));
//		System.out.println("get value "+mm.get(3));
//		System.out.println("get value "+mm.get(30));
		// LinkedHashMap 
//		Map mm = new LinkedHashMap();
//		mm.put(3, "Ravi");
//		mm.put(1, "Raju");
//		mm.put(4, "Ramesh");
//		mm.put(2, "Rajesh");
//		mm.put("a", "b");
//		mm.put(3, "Mahesh");
//		mm.put(null, "c");
//		mm.put(10, null);
//		mm.put(null, null);
//		System.out.println(mm);
//		System.out.println("search key "+mm.containsKey(3));
//		System.out.println("search key "+mm.containsKey(10));
//		System.out.println("search value "+mm.containsValue("Ravi"));
//		System.out.println("search value "+mm.containsValue("Mahesh"));
//		System.out.println("get value "+mm.get(3));
//		System.out.println("get value "+mm.get(30));
		
		// TreeMap 
		Map mm = new TreeMap();
		mm.put(3, "Ravi");
		mm.put(1, "Raju");
		mm.put(4, "Ramesh");
		mm.put(2, "Rajesh");
		//mm.put("a", "b");
		mm.put(3, "Mahesh");
		//mm.put(null, "c");
		mm.put(10, null);
		//mm.put(null, null);
		System.out.println(mm);
		System.out.println("search key "+mm.containsKey(3));
		System.out.println("search key "+mm.containsKey(10));
		System.out.println("search value "+mm.containsValue("Ravi"));
		System.out.println("search value "+mm.containsValue("Mahesh"));
		System.out.println("get value "+mm.get(3));
		System.out.println("get value "+mm.get(30));

	}

}
