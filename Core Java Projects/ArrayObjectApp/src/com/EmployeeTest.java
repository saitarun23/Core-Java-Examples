package com;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many employee record do you want to store?");
		int n=sc.nextInt();
		Employee employees[]=new Employee[n];
		System.out.println("enter the record one by one");
		for(int i=0;i<n;i++) {
			employees[i]=new Employee();
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name= sc.next();
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			employees[i].setId(id);
			employees[i].setName(name);
			employees[i].setSalary(salary);
		}
		// business logic. 
		for(Employee emp:employees) {
			//System.out.println("id is "+emp.getId()+" name is "+emp.getName()+" salary "+emp.getSalary());
			System.out.println(emp);
		}
	}
}

/*
	Output
	how many employee record do you want to store?
	1
	enter the record one by one
	object created..
	Enter the id
	100
	Enter the name
	sai
	Enter the salary
	25000
	Employee [id=100, name=sai, salary=25000.0]
*/