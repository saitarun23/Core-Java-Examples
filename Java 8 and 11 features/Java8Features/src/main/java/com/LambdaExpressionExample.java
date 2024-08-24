package com;

interface Hello{
	public String sayHello();
}
class HelloImp implements Hello{
	@Override
	public String sayHello() {
		return "Welcome using Hello Imp class";
	}
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		//
		Hello obj1=new HelloImp();
		System.out.println(obj1.sayHello());
		//
		
	}

}
