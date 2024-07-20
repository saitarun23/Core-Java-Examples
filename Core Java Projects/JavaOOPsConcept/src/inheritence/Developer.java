package inheritence;

public class Developer extends Employee{
	
	private String projectName;
	
	public void readDev() {
		System.out.println("Enter the Project Name");
		projectName=obj.next();
	}
	
	public void disDev() {
		System.out.println("Project Name is "+projectName);
	}
}
