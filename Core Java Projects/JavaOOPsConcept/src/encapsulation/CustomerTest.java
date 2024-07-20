package encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		c1.setId(100);
		c1.setCname("Sai");
		c1.setAge(24);
		
		System.out.println("Customer Details");
		System.out.println("id is "+c1.getId());
		System.out.println("name is "+c1.getCname());
		System.out.println("age is "+c1.getAge());
		
		Customer c2=new Customer(101,"Tarun",25);
		
		System.out.println("Customer Details");
		System.out.println("id is "+c2.getId());
		System.out.println("name is "+c2.getCname());
		System.out.println("age is "+c2.getAge());
	}

}

/*
		Output
		Customer Details
		id is 100
		name is Sai
		age is 24
		
		Customer Details
		id is 101
		name is Tarun
		age is 25

*/