package abc;					//java.util

public class Car {
	
	// property 
		int wheel;
		String colour;
		float price;			// instance variable. 
		
		Car() {			// empty constructor 
			System.out.println("object created...");
			wheel=4;
			colour="Black";
			price = 1000000;			// default value set for all object whenever memory created
		}
		
		Car(int wheel, String colour,float price) {			// parameterized constructor 
			System.out.println("object created with parameter");
			this.wheel=wheel;
			this.colour=colour;
			this.price=price;			// parameterized constructor 
		}
		// behaviour 
		
//		void setCarInfo(int wheel1, String colour1, float price1) {		// it is use to set the to instance variable. 
//			wheel=wheel1;
//			colour=colour1;
//			price=price1;
//		}
		
		void setCarInfo(int wheel, String colour, float price) {		// it is use to set the to instance variable. 
			this.wheel=wheel;			// instance variable and local or parameter variable have same 
			this.colour=colour;			// then local variable hide the visibility of instance variable 
			this.price=price;			// to avoid, we need to use this.instance variable. 
		}
		void start() {
			System.out.println("car start");
		}
		
		void appliedGear() {
			System.out.println("applied gear");
		}
		void moving() {
			System.out.println("car is moving");
		}
		void stop() {
			System.out.println("car stop");
		}
		void carInfo(String name) {
			String info="Car details "+name;		// local variable.
			System.out.println(info);
			System.out.println("wheel "+wheel);
			System.out.println("colour "+colour);
			System.out.println("price "+price);
			
		}

}
