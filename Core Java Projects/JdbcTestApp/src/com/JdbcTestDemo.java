package com;
import java.sql.*;
import java.util.Scanner;

public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","saivarun");
			System.out.println("Connected Successfuly");
			Statement stmt=con.createStatement();
			
			//Insert query
//			int result=stmt.executeUpdate("insert into employee values(1,'sai',14000)");
//			if(result>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			//delete query
//			int result=stmt.executeUpdate("delete from employee where id=5");
//			if(result>0) {
//				System.out.println("Record deleted successfully");
//			}
//			else {
//				System.out.println("Record not present");
//			}
			
			// update 
//			int result = stmt.executeUpdate("update employee set salary =45000 where id=2");
//			if(result>0) {
//				System.out.println("Record updated succesfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
			// retrieve records
//			ResultSet rs=stmt.executeQuery("select * from employee");
//			while(rs.next()) {
//				//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));
//				System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary "+rs.getFloat("salary"));
//			}
//			rs.close();
//			stmt.close();
			
			Scanner sc=new Scanner(System.in);
			// insert record using PreparedStatement
//			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
//			System.out.println("Enter the id");
//			int id=sc.nextInt();
//					pstmt.setInt(1, id);
//					
//			System.out.println("Enter the name");
//			String name= sc.next();
//					pstmt.setString(2, name);
//					
//			System.out.println("Enter the salary");
//			float salary  = sc.nextFloat();
//					pstmt.setFloat(3, salary);
//			
//			int result=pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Record inserted....");
//			}
			
			//Delete query using PreparedStatement
//			PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?");
//			System.out.println("Enter the id");
//			int id  = sc.nextInt();
//			pstmt.setInt(1, id);
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Record deleted...");
//			}else {
//				System.out.println("Record not present");
//			}
			
			// Updated query using PreparedStatement 
//			PreparedStatement pstmt = con.prepareStatement("update employee set salary=? where id=?");
//			System.out.println("Enter the id");
//			int id  = sc.nextInt();
//			System.out.println("Enter the salary to update");
//			float salary = sc.nextFloat();
//			
//			pstmt.setFloat(1, salary);
//			pstmt.setInt(2, id);
//			
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Record updated...");
//			}else {
//				System.out.println("Record not present");
//			}
			
			// retrieve with prepared statement with conditions. 
//			PreparedStatement pstmt = con.prepareStatement("select * from employee where salary>?");
//			System.out.println("Plz enter the salary");
//			float salary = sc.nextFloat();
//			pstmt.setFloat(1, salary);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			}
//			
//			rs.close();
//			pstmt.close();
			
			
			con.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}