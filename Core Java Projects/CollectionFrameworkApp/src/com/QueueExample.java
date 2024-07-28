package com;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue q1 = new PriorityQueue();
		q1.add(3);q1.add(1);q1.add(5);q1.add(4);q1.add(9);q1.add(7);
		Queue q2 = new LinkedList();
		q2.add(3);q2.add(1);q2.add(5);q2.add(4);q2.add(9);q2.add(7);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println("remove elements "+q1.poll());
		System.out.println("remove elements "+q2.poll());
		System.out.println(q1);
		System.out.println(q2);

	}

}
