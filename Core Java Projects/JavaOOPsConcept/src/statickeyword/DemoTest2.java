package statickeyword;

class Employee {
	int id;				// non static 
	static int mgrid;	// static 
	void dis1() {
		System.out.println("Employee id "+id);
		System.out.println("Manager id "+mgrid);
	}
}

public class DemoTest2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();		// heap or instance memory 
		Employee emp2 = new Employee();
			emp1.id=100;
				emp1.mgrid=101;
					Employee.mgrid=102;
					
						emp2.id=103;
							emp2.mgrid=104;
								Employee.mgrid=105;
								
		emp1.dis1();  // id = 100, mgrid = 105
		emp2.dis1();  // id=103, mgrid = 105 
	}
}

/*
	Output
	Employee id 100
	Manager id 105
	Employee id 103
	Manager id 105
*/