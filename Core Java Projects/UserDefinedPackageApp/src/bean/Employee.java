package bean;

public class Employee {
	private int id;
	String name;
	protected float salary;
	public String designation;
	
	public void disEmployee() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}
}