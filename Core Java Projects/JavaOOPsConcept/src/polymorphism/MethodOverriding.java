package polymorphism;

class Bike{
	void speed() {
		System.out.println("60km/hr");
	}
}	
class Honda extends Bike{					//re-usability : using super class speed method
	void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike{					//overriding : speed method 
	void color() {
		System.out.println("Gray");
	}
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}
class Tvs extends Bike{						//merge both the super and sub class method.
	void color() {
		System.out.println("Red");
	}
	@Override
	void speed() {
		super.speed();						//calling super class speed method : ie 60
		System.out.println("10km/hr");		// +10 merge code.
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Bike bb=new Bike();					bb.speed();
		Honda hh=new Honda();				hh.speed();		hh.color();
		Pulsar pu=new Pulsar();				pu.speed();		pu.color();
		Tvs tvs=new Tvs();					tvs.speed();	tvs.color();
	}
}

/*
	Output
	60km/hr
	60km/hr
	Black
	90km/hr
	Gray
	60km/hr
	10km/hr
	Red
*/