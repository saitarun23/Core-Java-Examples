package com;

import java.util.function.Function;

class MyFunctional implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "Your pass me number as "+t;
	}
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// 1st way 
		Function<Integer, String> fun1 = new MyFunctional();
		System.out.println(fun1.apply(100));
		// 2nd way using Lambda 
		Function<Integer, String> fun2 =(num)->"You pass me number as "+num;
		System.out.println(fun2.apply(200));
	}
}

/*
	Output
	Your pass me number as 100
	You pass me number as 200

*/