package statickeyword;

class Abc {
	int a;		// instance or non static variable 
	static int b;		// static variable 
	void dis1() {
		System.out.println("non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static method");
		//System.out.println("a "+a);
		System.out.println("b "+b);
	}
}

public class DemoTest1 {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.a=100;
		obj1.b=300;
		Abc.b=200;			// static variable 
		obj1.dis1();
		obj1.dis2();
		Abc.dis2();			// static method 
	}
}

/*
	Output
	non static method
	a 100
	b 200
	static method
	b 200
	static method
	b 200
*/