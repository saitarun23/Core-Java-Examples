package com;
class C implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class D implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("i "+j);
		}
	}
}

public class ImplementsRunnable {

	public static void main(String[] args) {
		C obj1=new C();
		D obj2=new D();
		Thread t1=new Thread(obj1);				//passing class object that class which implements Runnable interface 
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();

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
	i 0
	i 1
	i 2
	i 3
	i 4
	i 5
	i 6
	i 7
	i 8
	i 6
	i 7
	i 8
	i 9
	i 9
*/
