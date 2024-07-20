package encapsulation;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	void setValue(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		//this.salary=salary;
		if(salary<0) {
			this.salary=12000;
		}else {
			this.salary=salary;
		}
		
	}
	
	
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
