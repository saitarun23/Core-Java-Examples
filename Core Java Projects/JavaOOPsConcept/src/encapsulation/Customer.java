package encapsulation;

public class Customer {

	private int id;
	private String cname;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String cname, int age) {
		// super();
		this.id = id;
		this.cname = cname;
		this.age = age;
	}

}
