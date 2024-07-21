package com;

class VoteException extends Exception {
	public VoteException() {
		super();		// help to call empty constructor of Exception class
	}
	public VoteException(String msg) {
		//super();
		super(msg);			// help to call parameter constructor of Exception class to set the message 
	}
}

public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age =15;
		try {
			
		if(age<=18) {
			//throw new Exception();	// generic exception 
			//throw new Exception("age must be >18");// generic with custom message
			//throw new VoteException();		// custom exception 
			throw new VoteException("Age must be >18");	// custom exception with custom message.
		}else {
			System.out.println("You Can Vote!");
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}		
	}
}

/*
	Output
	com.VoteException: Age must be >18
*/