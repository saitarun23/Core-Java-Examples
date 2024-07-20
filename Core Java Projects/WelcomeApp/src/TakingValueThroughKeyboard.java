import java.util.Scanner;
public class TakingValueThroughKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		System.out.println("enter the value of a");
		int a = sc.nextInt();  // it is use to scan int value 
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Sum of two number is "+sum);
		
		 output
		 enter the value of a
		 10
		 enter the value of b
		 20
		 Sum of two number is 30
*/
		
/*		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();		// scan string value 
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		
		 Output
		 Enter the id
		 45
		 Enter the name
		 sai
		 Enter the salary
		 45000
		 id is 45
		 name is sai
		 salary is 45000.0
*/
		
		System.out.println("how many record do you want to store");
		int n = sc.nextInt();
		int id[]=new int[n];
		String names[]=new String[n];
		float salary[]=new float[n];
		String desg[]=new String[n];
		System.out.println("Enter each employee record one by one");
		for(int i=0;i<n;i++) {
			System.out.println("Enter id");
			id[i]=sc.nextInt();
			System.out.println("Enter name");
			names[i]=sc.next();
			System.out.println("Enter the salary");
			salary[i]=sc.nextFloat();
			System.out.println("Enter the desg");
			desg[i]=sc.next();
		}
		// business logic 
		for(int i=0;i<n;i++) {
			if(desg[i].equalsIgnoreCase("Manager")) {
				salary[i]=salary[i]+5000;
			}else if(desg[i].equals("Tester")) {
				salary[i]=salary[i]+3000;
			}else {
				salary[i]=salary[i]+1500;
			}
		}
		System.out.println("All Employee records are");
		for(int i=0;i<n;i++) {
		System.out.println("id is "+id[i]+" Name is "+names[i]+" Salary is "+salary[i]+" Designation is "+desg[i]);
		}
	}

}

/*
		Output
		how many record do you want to store
		4
		Enter each employee record one by one
		Enter id
		1
		Enter name
		sai
		Enter the salary
		1000
		Enter the desg
		manager
		Enter id
		2
		Enter name
		tarun
		Enter the salary
		500
		Enter the desg
		tester
		Enter id
		3
		Enter name
		rali
		Enter the salary
		2000
		Enter the desg
		manager
		Enter id
		4
		Enter name
		rst
		Enter the salary
		500
		Enter the desg
		hr
		All Employee records are
		id is 1 Name is sai Salary is 6000.0 Designation is manager
		id is 2 Name is tarun Salary is 2000.0 Designation is tester
		id is 3 Name is rali Salary is 7000.0 Designation is manager
		id is 4 Name is rst Salary is 2000.0 Designation is hr
*/