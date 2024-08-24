package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Myconsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("value is "+t);
	}
}
public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(10);num.add(50);num.add(70);num.add(40);
		num.add(20);num.add(60);num.add(80);num.add(90);
		System.out.println(num);
		System.out.println("Retrieve element one by one using for each");
		for(int n:num) {
			System.out.println(n);
		}
		Consumer<Integer> cc = new Myconsumer();
		num.forEach(cc);// it takes consumer interface reference. 
		Consumer<Integer> cc1 = (n)->System.out.println("Value using lambda "+n);
		num.forEach(cc1);
		num.forEach((n)->System.out.println("Value using lambda "+n));
	}
}

/*
	Output
	[10, 50, 70, 40, 20, 60, 80, 90]
	Retrieve element one by one using for each
	10
	50
	70
	40
	20
	60
	80
	90
	value is 10
	value is 50
	value is 70
	value is 40
	value is 20
	value is 60
	value is 80
	value is 90
	Value using lambda 10
	Value using lambda 50
	Value using lambda 70
	Value using lambda 40
	Value using lambda 20
	Value using lambda 60
	Value using lambda 80
	Value using lambda 90
	Value using lambda 10
	Value using lambda 50
	Value using lambda 70
	Value using lambda 40
	Value using lambda 20
	Value using lambda 60
	Value using lambda 80
	Value using lambda 90
*/