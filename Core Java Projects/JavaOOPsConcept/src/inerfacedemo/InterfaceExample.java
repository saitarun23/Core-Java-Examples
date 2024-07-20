package inerfacedemo;

interface Abc{
	int A=10;
	void dis1();
}
interface Xyz{
	int B=20;
	void dis2();
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