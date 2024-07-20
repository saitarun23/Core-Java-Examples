package inheritence;

public class Manager extends Employee{
	
	private int numberOfEmp;
	private Address add=new Address();
	
	public void readMgr() {
		readEmp();						//id,name,salary
		System.out.println("Enter the number of employee working under him/her");
		numberOfEmp=obj.nextInt();		//numberofemp
		add.readAdd();					//city and state
	}
	
	public void disMgr() {
		disEmp();						//display id,name,salary
		System.out.println("number of employee working under him/her "+numberOfEmp);
		add.disAdd();					//display city and state
	}

}
