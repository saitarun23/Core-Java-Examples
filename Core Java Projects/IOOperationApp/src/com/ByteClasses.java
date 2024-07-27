package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ByteClasses {

	public static void main(String[] args) throws Exception {
/*		System.out.println("Welcome");
		PrintStream ps = System.out;
		ps.println("Welcome to Java");
		InputStream is = System.in;
		
		Output
		Welcome
		Welcome to Java
*/
		
		// source --> keyboard, target --> console 
/*		DataInputStream dis = new DataInputStream(System.in);
		PrintStream ps = System.out;
		ps.println("Enter the name");
		String name = dis.readLine();
		ps.println("name is "+name);

		Output
		Enter the name
		sai tarun
		name is sai tarun
*/	
		
		// source --> keyboard, target --> file 
/*		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt",true);		//true append data 
		System.out.println("Enter the data");
		int ch;
		while((ch=dis.read()) != '@') {
			System.out.println(ch+" "+(char)ch);
			fos.write(ch);
		}
		fos.close();
		System.out.println("Data stored...");
*/
		
		// source --> file, target --> file or console
		//FileInputStream fis = new FileInputStream("C:\\Users\\akash\\Desktop\\EC2 Plugin Install.txt");
		FileInputStream fis = new FileInputStream("C:\\Java\\BirthdayProgram ");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		int ch;
		while((ch=fis.read()) != -1) {		//EOF : end of the file in java is -1
			System.out.print((char)ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("Data copied...");
	}
}
