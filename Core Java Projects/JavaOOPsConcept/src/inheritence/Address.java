package inheritence;

import java.util.Scanner;

public class Address {
	private String city;
	private String state;
	
	Scanner sc=new Scanner(System.in);
	
	public void readAdd() {
		System.out.println("Enter the City ");
		city=sc.next();
		System.out.println("Enter the State ");
		state=sc.next();
	}
	
	public void disAdd() {
		System.out.println("city is "+city);
		System.out.println("state is "+state);
	}
}
