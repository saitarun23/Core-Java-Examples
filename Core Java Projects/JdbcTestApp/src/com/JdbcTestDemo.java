package com;
import java.sql.*;

public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","saivarun");
			System.out.println("Connected Successfuly");
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}