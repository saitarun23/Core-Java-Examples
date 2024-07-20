package inheritence;

public class Developer extends Employee{
	
	private String projectName;
	
	public void readDev() {
		readEmp();
		System.out.println("Enter the Project Name");
		projectName=obj.next();
	}
	
	public void disDev() {
		disEmp();
		System.out.println("Project Name is "+projectName);
	}
}
