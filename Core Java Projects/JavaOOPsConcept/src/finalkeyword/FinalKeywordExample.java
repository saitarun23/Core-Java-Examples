package finalkeyword;

final class Bike{
	final int WHEEL=4;
	final void speed() {
		System.out.println("60km/hr");
	}
}
//class Honda extends Bike{
//	@Override
//	void speed() {
//		System.out.println("60km/hr");
//	}
//}

public class FinalKeywordExample {

	public static void main(String[] args) {
		final int A=10;
		//A=20; //error
		System.out.println(A);
		//Honda hh=new Honda();
		//hh.speed():
		Bike bb=new Bike();
		bb.speed();
	}
}

/*
	Output
	10
	60km/hr
*/