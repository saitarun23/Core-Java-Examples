package inheritence;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println("Generic employee Information");
		Employee emp=new Employee();
		
		emp.readEmp();
		emp.disEmp();
		
/*
		Output
		Generic employee Information
		Enter the id 
		1
		Enter the name
		sai
		Enter the salary
		25000
		id is 1
		name is sai
		salary is 25000.0
*/
		
		System.out.println("------------------------");
		System.out.println("Manager Information");
		Manager mgr=new Manager();
		
		//mgr.readEmp();	//id,name,salary
		mgr.readMgr();	    //numberofemp
		
		//mgr.disEmp();	    //id,name,salary
		mgr.disMgr();	    //numberofemp
		
/*
		Output
		Generic employee Information
		Enter the id 
		1
		Enter the name
		sai
		Enter the salary
		25000
		id is 1
		name is sai
		salary is 25000.0
		------------------------
		Manager Information
		Enter the id 
		2
		Enter the name
		tarun
		Enter the salary
		45000
		id is 2
		name is tarun
		salary is 45000.0
		Enter the number of employee working under him/her
		4
		id is 2
		name is tarun
		salary is 45000.0
*/
		
		System.out.println("------------------------");
		System.out.println("Developer Information");
		Developer dev=new Developer();
		
		//dev.readEmp();
		dev.readDev();
		
		//dev.disEmp();
		dev.disDev();
		
/*
		Output
		Developer Information
		Enter the id 
		4
		Enter the name
		saitarun
		Enter the salary
		45000
		id is 4
		name is saitarun
		salary is 45000.0
		Enter the Project Name
		java
		Project Name is java
*/
		
		System.out.println("------------------------");
		System.out.println("Project Manager Information");
		ProjectManager pmgr=new ProjectManager();
		
		//pmgr.readEmp();
		//pmgr.readMgr();
		pmgr.readPmgr();
		
		//pmgr.disEmp();
		//pmgr.disMgr();
		pmgr.disPmgr();
		
		/*
		Output
		Project Manager Information
		Enter the id 
		4
		Enter the name
		saitarun
		Enter the salary
		25000
		id is 4
		name is saitarun
		salary is 25000.0
		Enter client name
		IBM
		Client name is IBM
		 */
	}
}