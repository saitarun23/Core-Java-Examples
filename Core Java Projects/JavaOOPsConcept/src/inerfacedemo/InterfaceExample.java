package inerfacedemo;
/*
 * class Abc {
 *  int P=10;
 * 	void dis() {
 * 		System.out.println("Abc class dis method");
 * 	}
 * }
 * class Xyz {
 * int P=20;
 * 	void dis() {
 * 	System.out.println("Xyz class dis method");
 * }
 * }
 * class Mno extends Abc,Xyz {			Error 
 * 
 * }
 * 
 * 
 */

interface Abc{
	int A=10;
	int P=100;
	void dis1();
	void dis();
}
interface Xyz{
	int B=20;
	int P=200;
	void dis2();
	void dis();
}
interface Mno extends Abc,Xyz{
	int c=30;
	void dis3();
}
class Demo implements Abc,Xyz{

	@Override
	public void dis1() {
		System.out.println("Abc interface method");		
	}
	public void dis2() {
		System.out.println("Xyz interface method");
	}
	@Override
	public void dis() {
		System.out.println("Provided body for Abc and Xyz method");
		System.out.println("A "+A);
		System.out.println("B "+B);
		System.out.println("Abc interface P variable "+Abc.P);
		System.out.println("Xyz interface P variable "+Xyz.P);
	}
}
	
public class InterfaceExample {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
	}
}

/*
	Output
	Abc interface method
	Xyz interface method
*/