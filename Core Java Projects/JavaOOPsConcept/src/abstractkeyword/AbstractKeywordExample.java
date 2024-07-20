package abstractkeyword;

abstract class Bike{
	abstract void speed();
	void mailage() {
		System.out.println("45km/lt");
	}
}
class Honda extends Bike{
	@Override
	void mailage() {
		System.out.println("75km/lt");
	}
	void speed() {
		System.out.println("50km/hr");
	}
}
class Pulsar extends Bike{
	void speed() {
		System.out.println("90km/hr");
	}
}
public class AbstractKeywordExample {

	public static void main(String[] args) {
		Honda hh=new Honda();		hh.speed();		hh.mailage();
		Pulsar pu=new Pulsar();		pu.speed();		pu.mailage();
	
	}
}

/*
	Output
	50km/hr
	75km/lt
	90km/hr
	45km/lt
*/