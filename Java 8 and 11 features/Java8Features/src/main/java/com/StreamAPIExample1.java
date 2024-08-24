package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample1 {

	public static void main(String[] args) {
//		List<Integer> num=new ArrayList<Integer>();
//		num.add(10);num.add(50);num.add(70);num.add(40);
//		num.add(20);num.add(60);num.add(80);num.add(99);
//		num.add(21);num.add(61);num.add(87);num.add(90);
		//num.forEach(v->System.out.println(v));
		//num.stream().forEach(v->System.out.println(v));
		//num.stream().map(v->v+100).forEach(v->System.out.println(v));
		//System.out.println(num);
		//num.stream().filter(v->v%2==0).forEach(v->System.out.println(v));
		//num.stream().filter(v->v%2!=0).forEach(v->System.out.println(v));

		List<String> names = new ArrayList<String>();
		names.add("Ravi");names.add("Ajay");names.add("Stevena");names.add("Mahesh");names.add("Johna");
		names.add("Raju");names.add("Vijay");names.add("Reeta");names.add("Leena");names.add("Ramu");
		
		//names.forEach(v->System.out.println(v));
		//names.stream().map(v->v.toUpperCase()).forEach(v->System.out.println(v));
		//names.stream().filter(v->v.contains("ee")).forEach(v->System.out.println(v));
		//names.stream().filter(v->v.contains("ee")).map(v->"Welcome user "+v).forEach(v->System.out.println(v));
		boolean result1 = names.stream().anyMatch(v->v.startsWith("R"));
		System.out.println(result1);
		boolean result2 = names.stream().allMatch(v->v.contains("a"));
		System.out.println(result2);
		
//		List<String> names = new ArrayList<String>();
//		names.add("Ravi");names.add("Ajay");names.add("Stevena");names.add("Mahesh");names.add("Johna");
//		names.add("Raju");names.add("Vijay");names.add("Reeta");names.add("Leena");names.add("Ramu");
		
//		Stream<String> ss=names.stream();
//		Stream<String> ss1 = ss.filter(p->p.contains("ee"));
//		ss1.forEach(s->System.out.println(s));
//		//ss.forEach(s->System.out.println(s));
		
		List<Integer> ll = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = ll.stream().reduce(0, (ival,curval)->ival+curval);
		int sumofeven = ll.stream().filter(f->f%2==0).reduce(0, (ival,curval)->ival+curval);
//		int sum = ll.stream().reduce(0, (ival,curval)->{
//			System.out.println("ival "+ival+" cval "+curval);
//			return ival+curval;
//		});
		System.out.println(sum);
		System.out.println(sumofeven);
	}
}