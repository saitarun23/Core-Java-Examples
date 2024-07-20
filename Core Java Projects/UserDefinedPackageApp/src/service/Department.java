package service;
import bean.Employee;

public class Department {
	
	Employee emp=new Employee();
	public void disEmployee() {
		//System.out.println("id "+emp.id);		// private 
		//System.out.println("name "+emp.name);	// default 
		//System.out.println("salary "+emp.salary);	// protected 
		System.out.println("designation "+emp.designation);   // public 
	}
}

/*
	Output
	id 0
	name null
	salary 0.0
	designation null
*/