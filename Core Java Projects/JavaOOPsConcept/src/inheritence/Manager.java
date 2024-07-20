package inheritence;

public class Manager extends Employee{
	
	private int numberOfEmp;
	
	public void readMgr() {
		System.out.println("Enter the number of employee working under him/her");
		numberOfEmp=obj.nextInt();
	}
	
	public void disMgr() {
		System.out.println("number of employee working under him/her "+numberOfEmp);
	}

}
