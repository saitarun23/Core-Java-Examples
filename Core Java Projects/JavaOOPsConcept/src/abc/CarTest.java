package abc;

public class CarTest {

	public static void main(String[] args) {
		//start();
//		Car innova = new Car();		// heap memory 
//		innova.start();
//		innova.appliedGear();
//		innova.moving();
//		innova.stop();
		
		Car innova = new Car();
		innova.carInfo("Innova Car");
		innova.colour="White";
		innova.price=2600000;
		innova.wheel=4;
		innova.carInfo("Innova Car");
		
		System.out.println("-----------------------");
		
		Car ertiga = new Car();
		ertiga.carInfo("Ertiga Car");
		ertiga.colour="Gray";
		ertiga.price=1500000;
		ertiga.wheel=4;
		ertiga.carInfo("Ertiga Car");
		
		System.out.println("-----------------------");
		
		Car santro = new Car();
		santro.setCarInfo(4, "RED", 900000);		// passing value using parameter concept. 
		santro.carInfo("Santro");
		
		System.out.println("-----------------------");
		
		Car nexon = new Car(4,"Blue",1250000);		//dynamic value 
		nexon.carInfo("Nexon");

	}

}


/*
		Output
		object created...
		Car details Innova Car
		wheel 4
		colour Black
		price 1000000.0
		Car details Innova Car
		wheel 4
		colour White
		price 2600000.0
		-----------------------
		object created...
		Car details Ertiga Car
		wheel 4
		colour Black
		price 1000000.0
		Car details Ertiga Car
		wheel 4
		colour Gray
		price 1500000.0
		-----------------------
		object created...
		Car details Santro
		wheel 4
		colour RED
		price 900000.0
		-----------------------
		object created with parameter
		Car details Nexon
		wheel 4
		colour Blue
		price 1250000.0
*/