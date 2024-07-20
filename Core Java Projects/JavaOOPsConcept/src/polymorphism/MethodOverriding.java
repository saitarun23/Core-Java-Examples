package polymorphism;

class Bike{
	void speed() {
		System.out.println("60km/hr");
	}
}	
class Honda extends Bike{
	void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike{
	void color() {
		System.out.println("Gray");
	}
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Bike bb=new Bike();					bb.speed();
		Honda hh=new Honda();				hh.speed();		hh.color();
		Pulsar pu=new Pulsar();				pu.speed();		pu.color();
	}
}

/*
	Output
	60km/hr
	60km/hr
	Black
	90km/hr
	Gray
*/