package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args)throws Exception {
/*		Employee emp1 = new Employee(100,"Ravi",12000);
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
	
		Output
		id is 100
		name is Ravi
		salary is 12000.0
*/	
		
		// object serialization 
/*		Employee emp1 = new Employee(100,"Ravi",12000);
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("object serialization done successfully");
*/
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp2 = (Employee)obj;   // down level type casting 
		System.out.println("id is "+emp2.getId());
		System.out.println("name is "+emp2.getName());
		System.out.println("salary is "+emp2.getSalary());
		if(obj instanceof Employee) {
			System.out.println("yes");
		}
	}
}
