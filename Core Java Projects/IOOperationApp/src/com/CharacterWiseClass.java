package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharacterWiseClass {

	public static void main(String[] args) throws Exception{
		// source --> keyboard and target --> console 
				//InputStreamReader isr = new InputStreamReader(System.in);
				//BufferedReader br = new BufferedReader(isr);
//			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//				System.err.println("Enter the id");
//				int id = Integer.parseInt(br.readLine());
//				System.out.println("Enter your name");
//				String name = br.readLine();
//				System.out.println("your id is "+id);
//				System.out.println("your name is "+name);
				// source -> file targe --> file 
				FileReader fr = new FileReader("demo.txt");
				FileWriter fw = new FileWriter("demo1.txt");
				int ch;
				while((ch=fr.read())!= -1) {
					fw.write(ch);
				}
				fr.close();
				fw.close();
				System.out.println("Data copied");

	}

}
