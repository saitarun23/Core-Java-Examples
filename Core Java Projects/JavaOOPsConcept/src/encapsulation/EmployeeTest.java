package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		//id=100;
		//display();
		
		Employee emp1=new Employee();
		//emp1.id=100;
		//emp1.name="Sai";
		//emp1.salary=45000;
		
		emp1.setValue(100, "sai", 25000);
		emp1.display();
		
	}

}

/*
 		Output
 		id is 100
		name is sai
		salary is 25000.0
*/
