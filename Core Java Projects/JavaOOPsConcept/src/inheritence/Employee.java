package inheritence;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	Scanner obj =new Scanner(System.in);
	
	public void readEmp() {
		System.out.println("Enter the id ");
		id=obj.nextInt();
		System.out.println("Enter the name");
		name=obj.next();
		System.out.println("Enter the salary");
		salary=obj.nextFloat();
	}
	//business logic
	
	public void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
