package com;

public class DefaultTread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Demo Thread");
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		t.setPriority(6);
		System.out.println(t);
		ThreadGroup tg=t.getThreadGroup();
		System.out.println(tg.getName());
		System.out.println(tg);
	}
}

/*
	Output
	Thread[#1,main,5,main]
	Thread[#1,Demo Thread,5,main]
	Thread[#1,Demo Thread,10,main]
	Thread[#1,Demo Thread,6,main]
	main
	java.lang.ThreadGroup[name=main,maxpri=10]
*/