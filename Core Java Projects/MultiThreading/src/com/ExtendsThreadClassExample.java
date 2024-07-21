package com;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClassExample {

	public static void main(String[] args) {
		A obj1 = new A();		// thread class reference 
		B obj2 = new B();
		
		obj1.start();         // ready to start ie Runnable state 
		obj2.start();		// it call run method of thread class which contain empty body
	}
}

/*
	Output
	i 0
	i 1
	i 2
	i 3
	i 4
	i 5
	i 6
	i 7
	i 8
	j 0
	j 1
	j 2
	j 3
	j 4
	j 5
	j 6
	j 7
	i 9
	j 8
	j 9
*/