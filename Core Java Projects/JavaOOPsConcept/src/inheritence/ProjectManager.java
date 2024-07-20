package inheritence;

public class ProjectManager extends Manager{
	
	private String clientName;
	
	public void readPmgr() {
		System.out.println("Enter client name");
		clientName=obj.next();
	}
	
	public void disPmgr() {
		System.out.println("Client name is "+clientName);
	}

}
