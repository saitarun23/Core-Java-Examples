package com;

public class StringExample {

	public static void main(String[] args) {
//		String str1 = "Welcome to Java Training";
//		String str2 = new String("Welcome to Java Training");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.substring(4));
//		System.out.println(str1.substring(4, 6));
//		System.out.println(str1.indexOf('o'));
//		System.out.println(str1.charAt(0));
		
/*
 		Output
 		Welcome to Java Training
		Welcome to Java Training
		welcome to java training
		WELCOME TO JAVA TRAINING
		ome to Java Training
		om
		4
		W
*/

		String name1 = "Raj";			// one memory 
		String name2 = "Raj";			//	same memory 
		String name3  = new String("Raj");	// new memory 
		String name4 = new String("Raj");	// new memory 
//		if(name3==name4) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		if(name3.equals(name1)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
/*
		Output
		Not Equal
		------------
		Equal
*/
		
		String msg="Hello";		// new memory 
		System.out.println(msg);
			System.out.println(msg.toLowerCase());
		System.out.println(msg);
		msg = msg+" How r you";	// old memory get destroy msg refer to new memory with msg +"how r you"
		System.out.println(msg);
		System.out.println("----------------");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
			System.out.println(sb.append(" How r you"));
		System.out.println(sb);
		
/*
		Output
		Hello
		hello
		Hello
		Hello How r you
		----------------
		Hello
		Hello How r you
		Hello How r you
*/
	}
}