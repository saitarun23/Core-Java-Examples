package entity;

import bean.Employee;

public class Developer extends Employee{
	
	public void disDeveloper() {	
		//System.out.println("id "+id);// private 
		//System.out.println("name "+name); // default 
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}
}

/*
	Output
	id 0
	name null
	salary 0.0
	designation null
*/