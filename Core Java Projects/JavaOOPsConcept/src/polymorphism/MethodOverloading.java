package polymorphism;


class Operation{
	
	void add() {
		System.out.println(10+20);
	}
	
	void add(int x) {
		System.out.println(x+20);
	}
	
	void add(int x,int y) {
		System.out.println(x+y);
	}
	
	void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	
	void add(String x, String y) {
		System.out.println(x+y);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Operation op=new Operation();
		op.add();
		op.add(10);
		op.add("10", "20");
		op.add(1, 2, 3);	
	}
	
}

/*
		Output
		30
		30
		1020
		6
*/